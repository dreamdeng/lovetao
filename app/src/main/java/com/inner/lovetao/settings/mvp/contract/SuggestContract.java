package com.inner.lovetao.settings.mvp.contract;

import com.inner.lovetao.core.TaoResponse;
import com.inner.lovetao.settings.request_bean.SuggestRequest;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import io.reactivex.Observable;


/**
 * Desc:
 * Created by xcz
 * on 2019/02/14
 */
public interface SuggestContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void suggestSu();
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<TaoResponse<Boolean>> suggest(SuggestRequest content);
    }
}
