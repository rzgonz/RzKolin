package rzgonz.core.kotlin.contract
/**
 * Created by rzgonz on 7/10/17.
 */
 object DIBaseContract{

    interface  View : BaseContract.View {
        fun inject()

        fun onAttachView()

        fun onDetachView()
    }

   interface Presenter<in V: View> :BaseContract.Presenter<V> {

    }
}