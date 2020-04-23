package br.com.smu.APIListener;

import java.util.Map;
import java.util.logging.Logger;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;

import br.com.smu.APIListener.PubSubBackground.PubSubMessage;

public class PubSubBackground implements BackgroundFunction<PubSubMessage> {
  private static final Logger logger =
      Logger.getLogger(PubSubBackground.class.getName());

  @Override
  public void accept(PubSubMessage pubSubMessage, Context context) {
    logger.info("Received message with id " + pubSubMessage.messageId);
  }

  public static class PubSubMessage {
    public String data;
    public Map<String, String> attributes;
    public String messageId;
    public String publishTime;
  }
}