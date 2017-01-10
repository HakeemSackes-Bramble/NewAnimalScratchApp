package nyc.c4q.hakeemsackes_bramble.newscratchanimalapp.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hakeemsackes-bramble on 1/3/17.
 */

public class OneTwoView extends TextView {
    private final String[] A = {"one", "two"};
    private String b = A[0];


    public OneTwoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView view = (TextView) v;
                if (view.getText().equals(A[0])) {
                    b = A[1];
                } else if (view.getText().equals(A[1])) {
                    b = A[0];
                }
            }
        });
        this.setOnDragListener(new OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                return false;
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.setPadding(10, 10, 10, 10);
        this.setText(b);
    }

}
