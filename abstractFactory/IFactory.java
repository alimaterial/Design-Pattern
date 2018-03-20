package abstractFactory;

public interface IFactory {
  IAudio getAudio();
  IVideo getVideo();
  IMag getMag();
}
