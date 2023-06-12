SUMMARY = "Desktop Recorder"
DESCRIPTION = "recordMyDesktop is a program that captures audio and video data from a Linux \
desktop session, producing an Ogg-encapsulated Theora-Vorbis file. The main \
goal is to be as unobstrusive as possible by proccessing only regions of the \
screen that have changed."
LICENSE = "GPL-2.0"

PV = "0.4.0"

RPM_NAME = "recordmydesktop-0.4.0-1.9.aarch64.rpm"
RPM_HASH = "1613f44077da49baa89bf97f94490b1273d736164376ecb1c78294ce0abaaecf76a84e31657578243b9e11b29e596f476407a4c3860fcf02731209e519f7c536"

RPROVIDES:${PN} += "recordmydesktop \
recordmydesktop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
libogg.so.0()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libtheora.so.0()(64bit) \
libtheora.so.0(libtheora.so.1.0)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
