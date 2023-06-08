SUMMARY = "A karaoke and text codec for embedding in Ogg"
DESCRIPTION = "Kate is a codec for karaoke and text encapsulation for Ogg. Most of the \
time, this would be multiplexed with audio/video to carry subtitles, \
song lyrics (with or without karaoke data), etc, but doesn't have to be. \
A possible use of a lone Kate stream would be an e-book. Moreover, the \
motion feature gives Kate a powerful means to describe arbitrary curves, \
so hand drawing of shapes can be achieved. \
 \
This was originally meant for karaoke use, but can be used for any \
purpose. Motions can be attached to various semantics, like position, \
color, etc, so scrolling or fading text can be defined."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "liboggkate1-0.4.1-26.15.aarch64.rpm"
RPM_HASH = "db2bb6b21d03ab1797ea512fc87d749149d8473b728e40ecb3b68ec610262313a542591c2b26a02934bb1e71ac85a5d2adc1601e32d675f31da7b21d4a62340c"

RPROVIDES:${PN} += "liboggkate.so.1()(64bit) liboggkate1 liboggkate1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkate.so.1()(64bit)"

inherit rpm
