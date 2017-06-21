package com.solga.fifty2.ui.activities;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.solga.fifty2.R;
import com.solga.fifty2.data.managers.DataManager;
import com.solga.fifty2.utils.ConstantManager;

import org.xml.sax.ErrorHandler;


public class AuthActivity extends BaseActivity implements View.OnClickListener {

    private Button mSignIn;
    private TextView mRememberPassword, mRegistration;
    private EditText mLogin, mPassword;
    private CoordinatorLayout mCoordinatorLayout;
    private DataManager mDataManager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_auth);
            mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.auth_coordinator_container);
            mSignIn = (Button) findViewById(R.id.login_btn);
            mRememberPassword = (TextView) findViewById(R.id.remember_tv);
            mRegistration = (TextView) findViewById(R.id.registration_tv);
            mLogin = (EditText) findViewById(R.id.login_email_et);
            mPassword = (EditText) findViewById(R.id.login_password_et);

            mRememberPassword.setOnClickListener(this);
            mRegistration.setOnClickListener(this);
            mSignIn.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.login_btn:
                    showSnackbar("Авторизация...");
                    signIn();
                    break;
                case R.id.remember_tv:
/*                    Intent rememberIntent = new Intent(AuthActivity.this, UserRememberPasswordActivity.class);
                    startActivity(rememberIntent);*/
                    showSnackbar("Напомнить пароль");
                    break;
                case R.id.registration_tv:
                    showSnackbar("Зарегистрировать");
/*                    Intent registrationIntent = new Intent(AuthActivity.this, UserRegistrationActivity.class);
                    startActivity(registrationIntent);*/
                    break;
            }
        }

        private void showSnackbar(String message){
            Snackbar.make(mCoordinatorLayout, message, Snackbar.LENGTH_LONG).show();
        }

/*        private void loginSuccess(Response<UserLoginRes> response)
        {
            mDataManager.getPreferenceManager().saveAuthToken(response.body().getToken());
            mDataManager.getPreferenceManager().saveUserId(response.body().getIdUser());
            mDataManager.getPreferenceManager().saveUserMobile(response.body().getPhoneUser());
            mDataManager.getPreferenceManager().saveUserEmail(response.body().getEmailUser());
            Intent loginIntent = new Intent(AuthActivity.this, MainActivity.class);
            startActivity(loginIntent);

        }*/

        private void signIn(){
            if ((mLogin.getText().toString().equals(ConstantManager.LOGIN))&&(mPassword.getText().toString().equals(ConstantManager.PASSWORD))){
                showSnackbar("Авторизация успешна");
/*                Intent loginIntent = new Intent(AuthActivity.this, MainActivity.class);
                startActivity(loginIntent);*/
            }
            else {
                showSnackbar("Не правильный логин или пароль");
            }
/*            if (NetworkStatusChecker.isNetworkAvailable(this)) {
                Call<UserLoginRes>  call = mDataManager.loginUser(new UserLoginReq(ConstantManager.JSON_METHODS[ConstantManager.AUTHORIZATION], new UserLoginOption(mLogin.getText().toString(), mPassword.getText().toString())));
                call.enqueue(new Callback<UserLoginRes>() {
                    @Override
                    public void onResponse(Call<UserLoginRes> call, Response<UserLoginRes> response) {
                        if (response.code() == 200){
                            if (response.body().getCode().equals("00000")){
                                showSnackbar(ErrorHandler.getErrorHandler(response.body().getCode(),ConstantManager.AUTHORIZATION));
                                loginSuccess(response);
                            }else{
                                showSnackbar(ErrorHandler.getErrorHandler(response.body().getCode(),ConstantManager.AUTHORIZATION));
                            }
                        } else if (response.code() == 404){
                            showSnackbar("Неверный логин или пароль!");
                        } else {
                            showSnackbar("Что-то пошло не так!");
                        }
                    }

                    @Override
                    public void onFailure(Call<UserLoginRes> call, Throwable t) {

                    }
                });
            }else{
                showSnackbar("Сеть на данный момент не доступна, попробуйте позже.");
            }*/
        }
}
