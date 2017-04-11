package com.jackson.commonutillib;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jackson on 2017/4/11.
 * Version : 1
 * Details :
 */
public class ViewUtil {

    public ViewUtil() {
        throw new UnsupportedOperationException("Do not need instantiate!");
    }


    /**
     * 获取字高
     *
     * @param view
     * @return 字高
     */
    public static int getFontHeight(TextView view) {
        Paint paint = new Paint();
        paint.setTextSize(view.getTextSize());
        Paint.FontMetrics fm = paint.getFontMetrics();
        return (int) (Math.ceil(fm.descent - fm.ascent));
    }

    public static void setViewHeight(View view, int height) {
        if (view == null) {
            return;
        }

        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(view.getMeasuredWidth(), height);
            view.setLayoutParams(params);
            return;
        }
        params.height = height;
    }

    public static void setViewWidth(View view, int width) {
        if (view == null) {
            return;
        }

        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(width, view.getMeasuredHeight());
            view.setLayoutParams(params);
            return;
        }
        params.width = width;
    }

    public static void setViewSize(View view, int width, int height) {
        if (view == null) {
            return;
        }

        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(width, height);
            view.setLayoutParams(params);
            return;
        }
        params.width = width;
        params.height = height;
    }
}
