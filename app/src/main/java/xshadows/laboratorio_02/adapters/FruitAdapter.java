package xshadows.laboratorio_02.adapters;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import xshadows.laboratorio_02.models.Fruit;

public class FruitAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<Fruit> list;

    public FruitAdapter(Context context, int layout, List<Fruit> list){
        this.context=context;
        this.layout=layout;
        this.list=list;
    }

    @Override
    public int getCount() {return list.size();}

    @Override
    public Object getItem(int position) {return list.get(position);}

    @Override
    public long getItemId(int id) {return id;}

    static class ViewHolder{
        private TextView name;
        private TextView origin;
        private ImageView icon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;

        if (convertView ==null){
            //SOLO SI ESTA NULO, ES DECIR, PROMERA VEZ EN SER RENDERIZADO, INFLAMOS
            //Y ADJUNTAMOS LAS REFERENCIAS DEL LAYOUT EN UNA NUEVA INSTANCIA DE NUESTRA
            //VIEWHOLDER, Y LO INSERTAMOS DENTRO DEL CONVERTVIEW, PARA RECICLAR SU USO

            convertView= LayoutInflater.from(context).inflate(layout, null );
            holder=new ViewHolder();
            holder.name =(TextView) convertView.findViewById(R.id.textViewName);
            holder.origin=(TextView) convertView.findViewById(R.id.texVie);
            holder.icon=(ImageView) convertView.findViewById(R.id.imageViewIcon);
            convertView.setTag(holder);
        }else{
            //OBTENEMOS LA REFERENCIA QUE POSTERIORMENTE PUSIMOS DENTRO DEL CONVERVIEW
            //Y ASI, RECICLAMOS SU USO SIN NECESIDAD DE BUSCAR DE NUEVO, REFERENCIAS CON FINDVIEWBYID
            holder =(ViewHolder) convertView.getTag();
        }
        final Fruit currentFruit = getItem(position);
        holder.name.setText(currentFruit.getName());
        holder.origin.setText(currentFruit.getOrigin());
        holder.icon.setImageResource(currentFruit.getIcon());
    }
}
