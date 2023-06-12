SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_image5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "90263fef2057a9192fd5937582fed00ee148bae16aa20aa60f03c6f77578aa237b124d8769796311b569bd60f10db143e75fe005e48322ba22de55aea3b413ef"

RPROVIDES:${PN} += "liballegro_image.so.5.2()(64bit) \
liballegro_image5_2 \
liballegro_image5_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballegro.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfreeimage.so.3()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
