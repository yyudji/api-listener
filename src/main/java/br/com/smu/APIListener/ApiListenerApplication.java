package br.com.smu.APIListener;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class ApiListenerApplication {

	interface Webhook {
		
		@GET("/i/VLrGjtCi/in/")
		Call<ResponseBody> getUrl();
	}
	public static void main(String[] args) throws IOException {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://api.webhookinbox.com/")
				.build();
		Webhook webhook = retrofit.create(Webhook.class);
		
		final Call<ResponseBody> call = webhook.getUrl();
		final ResponseBody getUrl = call.execute().body();
	}
	

}
