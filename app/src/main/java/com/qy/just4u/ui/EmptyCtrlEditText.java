package com.qy.just4u.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * 根据设置的值是否为空来控制其可编辑的属性
 * Created by abc on 2016/11/17.
 */

public class EmptyCtrlEditText extends EditText {
    public EmptyCtrlEditText(Context context) {
        super(context);
    }

    public EmptyCtrlEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyCtrlEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        if (!TextUtils.isEmpty(text)) {
            setEnabled(false);
        } else {
            setEnabled(true);
        }
    }
}
