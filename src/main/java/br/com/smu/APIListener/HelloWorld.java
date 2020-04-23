package br.com.smu.APIListener;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import retrofit2.Call;
import retrofit2.Retrofit;

public class HelloWorld implements HttpFunction {
	
  @Override
  public void service(HttpRequest request, HttpResponse response)
      throws Exception {
  }

}
