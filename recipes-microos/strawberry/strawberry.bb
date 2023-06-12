SUMMARY = "A music player and music collection organizer"
DESCRIPTION = "Strawberry is a music player and music collection organizer. \
It is a fork of Clementine. The name is inspired by the band Strawbs. \
 \
Features: \
  - Play and organize music \
  - Supports WAV, FLAC, WavPack, DSF, DSDIFF, Ogg FLAC, Ogg Vorbis, Ogg Opus, Ogg Speex, MPC, TrueAudio, \
    AIFF, MP4, MP3, ASF and Monkey's Audio. \
  - Audio CD playback \
  - Native desktop notifications \
  - Playlists in multiple formats \
  - Advanced audio output and device options \
  - Edit tags on music files \
  - Fetch tags from MusicBrainz \
  - Album cover art from Last.fm, Musicbrainz, Discogs, Musixmatch, Deezer, Tidal, Qobuz and Spotify \
  - Song lyrics from Lyrics.com, AudD, Genius, Musixmatch, ChartLyrics, lyrics.ovh and lololyrics.com \
  - Support for multiple backends \
  - Audio analyzer \
  - Equalizer \
  - Transfer music to iPod, MTP or mass-storage USB player \
  - Scrobbler with support for Last.fm, Libre.fm and ListenBrainz \
  - Subsonic streaming support"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.17"

RPM_NAME = "strawberry-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "c79b8e884f218c0e9acfb5671e3e8845afd10b374bcd50f86cf30a756eec45b3bbe9b5fe71e43df98be41bcdb173badafbe68b14262d58baeef6f07d3e105b7b"

RPROVIDES:${PN} += "application() application(org.strawberrymusicplayer.strawberry.desktop) metainfo() metainfo(org.strawberrymusicplayer.strawberry.appdata.xml) mimehandler(application/ogg) mimehandler(application/x-ogg) mimehandler(application/x-ogm-audio) mimehandler(audio/aac) mimehandler(audio/flac) mimehandler(audio/mp4) mimehandler(audio/mpeg) mimehandler(audio/mpegurl) mimehandler(audio/ogg) mimehandler(audio/vnd.rn-realaudio) mimehandler(audio/vorbis) mimehandler(audio/x-ape) mimehandler(audio/x-flac) mimehandler(audio/x-mp3) mimehandler(audio/x-mpeg) mimehandler(audio/x-mpegurl) mimehandler(audio/x-ms-wma) mimehandler(audio/x-musepack) mimehandler(audio/x-oggflac) mimehandler(audio/x-pn-realaudio) mimehandler(audio/x-scpls) mimehandler(audio/x-speex) mimehandler(audio/x-vorbis) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-wav) mimehandler(audio/x-wavpack) mimehandler(video/x-ms-asf) mimehandler(x-content/audio-player) mimehandler(x-scheme-handler/tidal) strawberry strawberry(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Concurrent.so.6()(64bit) libQt6Concurrent.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libX11.so.6()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libchromaprint.so.1()(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgpod.so.4()(64bit) libgstapp-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmtp.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtag.so.1()(64bit) qt6-sql-sqlite"

inherit rpm
