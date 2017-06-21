package com.solga.fifty2.data.managers;

import android.content.Context;

import com.solga.fifty2.utils.Fifty2App;
import com.solga.fifty2.data.managers.PreferenceManager;

/*
import com.solga.fifty2.data.network.RestService;
import com.solga.fifty2.data.network.ServiceGenerator;
import com.solga.fifty2.data.network.req.DeviceAddReq;
import com.solga.fifty2.data.network.req.DeviceDeleteReq;
import com.solga.fifty2.data.network.req.GetDevicesReq;
import com.solga.fifty2.data.network.req.SettingsDeviceReq;
import com.solga.fifty2.data.network.req.UserDataChangeReq;
import com.solga.fifty2.data.network.req.UserLoginReq;
import com.solga.fifty2.data.network.req.UserRegReq;
import com.solga.fifty2.data.network.req.UserResetPasswordReq;
import com.solga.fifty2.data.network.req.UserSetPasswordReq;
import com.solga.fifty2.data.network.res.GetDevicesRes;
import com.solga.fifty2.data.network.res.M180SettingsDeviceRes;
import com.solga.fifty2.data.network.res.UserLoginRes;
import com.solga.fifty2.data.network.res.UserAccoutActionRes;
import retrofit2.Call;
*/

public class DataManager {

    private static DataManager INSTANCE = null;

    private Context mContext;
    private PreferenceManager mPreferenceManager;
  //  private RestService mRestService;

   // private DaoSession mDaoSession;


    public DataManager() {
        this.mPreferenceManager = new PreferenceManager();
        this.mContext = Fifty2App.getContext();
    //    this.mRestService = ServiceGenerator.createService(RestService.class);
    //    this.mDaoSession = GPSMarkerCommanderApp.getDaoSession();
    }


    public static DataManager getInstance(){
        if (INSTANCE==null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public PreferenceManager getPreferenceManager() {  return mPreferenceManager; }

/*    public Call<UserLoginRes> loginUser(UserLoginReq userLoginReq){
        return mRestService.loginUser(userLoginReq);
    }

    public Call<GetDevicesRes> getDevicesFromNetwork(GetDevicesReq getDevicesReq){
        return mRestService.getDevices(getDevicesReq);
    }

    public Call<M180SettingsDeviceRes> getM180SettingsDeviceFromNetwork(SettingsDeviceReq getM180SettingsDevice){
        return mRestService.getM180SettingsDevice(getM180SettingsDevice);
    }

    public Call<UserAccoutActionRes> setUserResetPassword(UserResetPasswordReq userResetPasswordReq){
        return mRestService.setUserResetPassword(userResetPasswordReq);
    }

    public Call<UserAccoutActionRes> userRegistration(UserRegReq userRegReq){
        return mRestService.userRegistration(userRegReq);
    }

    public Call<UserAccoutActionRes> setUserPassword(UserSetPasswordReq setUserPasswordReq){
        return mRestService.setUserPassword(setUserPasswordReq);
    }

    public Call<UserAccoutActionRes> newDeviceAdd(DeviceAddReq newDeviceAddReq){
            return mRestService.newDeviceAdd(newDeviceAddReq);
    }


    public Call<UserAccoutActionRes> userDataChange (UserDataChangeReq userDataChangeReq) {
        return mRestService.userDataChange(userDataChangeReq);
    }

    public Call<UserAccoutActionRes> deviceDelete (DeviceDeleteReq deviceDeleteReq) {
        return mRestService.deviceDelete(deviceDeleteReq);
    }

    public Call<UserAccoutActionRes> setM180SettingsDevice(SettingsDeviceReq setM180SettingsDeviceReq) {
        return mRestService.setM180SettingsDevice(setM180SettingsDeviceReq);
    }*/


/*    public List<M180Device> getM180DeviceFromDB (){
        List<M180Device> temp = new ArrayList<>();
        return temp;
    }

    public List<User> getUserFromDB (){
        List<User> temp = new ArrayList<>();
        return temp;
    }*/
}