SUMMARY = "Music player with a Waveform Progress Bar"
DESCRIPTION = "Nulloy is a opensource, simple and clean music player with a Waveform \
Progressbar. It is written in C++ using QT."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "0060c8453d6bf8aa9635cb2a380805d03b342ad77a1322c523ba4165a90294054ea5f65e6ed2cb4c785befeeffab603063fd70892afe6be1809190081aa4cdde"

RPROVIDES:${PN} += "application() application(nulloy.desktop) mimehandler(audio/ape) mimehandler(audio/basic) mimehandler(audio/flac) mimehandler(audio/mp4) mimehandler(audio/mpeg) mimehandler(audio/mpeg3) mimehandler(audio/ogg) mimehandler(audio/wav) mimehandler(audio/wv) mimehandler(audio/x-aiff) mimehandler(audio/x-ape) mimehandler(audio/x-m4a) mimehandler(audio/x-matroska) mimehandler(audio/x-mpeg-3) mimehandler(audio/x-ms-wma) mimehandler(audio/x-musepack) mimehandler(audio/x-tta) mimehandler(audio/x-wavpack) mimehandler(x-content/audio-player) nulloy nulloy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxcb.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
