# Diagrama de classes

```mermaid
classDiagram
  class Phone
  Phone: +call(String number) void
  Phone: +answer() void
  Phone: +startVoiceMail() void

  class MusicPlayer
  MusicPlayer: +play() void
  MusicPlayer: +pause() void
  MusicPlayer: +selectSong(String song) void

  class InternetBrowser
  InternetBrowser: +newTab() void
  InternetBrowser: +showPage(String url) void
  InternetBrowser: +refresh() void

  class Smartphone
  Smartphone "0..*" o-- "1" Phone : possui
  Smartphone "0..*" o-- "1..*" MusicPlayer : possui
  Smartphone "0..*" o-- "1..*" InternetBrowser : possui
```
