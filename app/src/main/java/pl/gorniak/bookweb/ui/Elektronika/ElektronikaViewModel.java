package pl.gorniak.bookweb.ui.Elektronika;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ElektronikaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public  ElektronikaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Elektronika fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}