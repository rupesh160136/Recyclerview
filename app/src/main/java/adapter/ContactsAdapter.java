package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.recycler_view.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter {
    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName,tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgprofile);
            tvName = itemView.findViewById(R.id.tvname);
            tvPhone = itemView.findViewById(R.id.tvPhone);



        }
    }


}
