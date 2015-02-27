package lesdo.demo2.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import lesdo.demo2.R;

/**
 * Created by zhulonglong on 15/2/27.
 */
public class NumberAdapter extends BaseAdapter {

    private Context context;

    public NumberAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = View.inflate(context, R.layout.muber_item, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText("这个位置是" + position + "   哈哈 这是第三次了");
        return convertView;
    }

    private class ViewHolder{
        private TextView textView;
        public ViewHolder(View view){
            textView = (TextView) view.findViewById(R.id.textView);
        }
    }

}
