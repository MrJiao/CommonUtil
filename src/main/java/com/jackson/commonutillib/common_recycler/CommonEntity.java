package com.jackson.commonutillib.common_recycler;

/**
 * Created by Jackson on 2017/4/6.
 * Version : 1
 * Details :
 */
public abstract class CommonEntity {
    public static final int ALL_TYPE =14324650;

    public int getViewType(){
        return ALL_TYPE;
    }

    protected abstract int getLayout();

    protected abstract void setView(JViewHolder holder, int position);

    protected void onRecycle(JViewHolder holder){}

}
