package br.com.smu.APIListener;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Webhook {

	@GET("/i/VLrGjtCi/in/")
	Call<String> getUrl();
}
