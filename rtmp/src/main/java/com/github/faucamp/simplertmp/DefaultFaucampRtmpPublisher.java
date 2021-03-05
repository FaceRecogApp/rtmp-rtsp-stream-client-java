package com.github.faucamp.simplertmp;

import com.github.faucamp.simplertmp.io.FaucampRtmpConnection;
import net.ossrs.rtmp.ConnectCheckerRtmp;

/**
 * Srs implementation of an RTMP publisher
 *
 * @author francois, leoma, pedro
 */
public class DefaultFaucampRtmpPublisher implements FaucampRtmpPublisher {

  private FaucampRtmpConnection rtmpConnection;

  public DefaultFaucampRtmpPublisher(ConnectCheckerRtmp connectCheckerRtmp) {
    rtmpConnection = new FaucampRtmpConnection(connectCheckerRtmp);
  }

  @Override
  public boolean connect(String url) {
    return rtmpConnection.connect(url);
  }

  @Override
  public boolean publish(String publishType) {
    return rtmpConnection.publish(publishType);
  }

  @Override
  public void close() {
    rtmpConnection.close();
  }

  @Override
  public void publishVideoData(byte[] data, int size, int dts) {
    rtmpConnection.publishVideoData(data, size, dts);
  }

  @Override
  public void publishAudioData(byte[] data, int size, int dts) {
    rtmpConnection.publishAudioData(data, size, dts);
  }

  @Override
  public void setVideoResolution(int width, int height) {
    rtmpConnection.setVideoResolution(width, height);
  }

  @Override
  public void setAuthorization(String user, String password) {
    rtmpConnection.setAuthorization(user, password);
  }

  @Override
  public void setLogs(boolean enable) {
    rtmpConnection.setLogs(enable);
  }
}
