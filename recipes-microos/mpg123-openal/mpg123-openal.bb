SUMMARY = "OpenAL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for openal output support."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-openal-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "16e453d2df1f0511e2335857f6063c71cc14de90769f6d8bc7fc61778bc5afd0cc120f73b135e5fdbd3a976058eb7e2f320cf3864116ba974de56d20a81771d0"

RPROVIDES:${PN} += "mpg123-openal \
mpg123-openal(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopenal.so.1()(64bit)"

inherit rpm
