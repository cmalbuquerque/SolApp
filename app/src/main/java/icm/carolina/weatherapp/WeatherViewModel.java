package icm.carolina.weatherapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.HashMap;
import java.util.List;


public class WeatherViewModel extends AndroidViewModel {

    private WeatherRepository weatherRepo;


    public WeatherViewModel(Application application) {
        super(application);
        weatherRepo = new WeatherRepository(application);
    }

    public LiveData<List<WeatherPrev>> getWeatherLocalLiveData() {
        return weatherRepo.getAllWeatherLocal();
    }

    /*public HashMap<Integer, Local> getLocalLiveData() {
        return weatherRepo.getMapLocais();
    }
    */
}

