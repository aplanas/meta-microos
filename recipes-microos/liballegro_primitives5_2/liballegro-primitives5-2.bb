SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_primitives5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "0ce1f588830b9b4c0c964f3a49fc1a3c5349c78c72487bd8029183452f7ec14d373285bb02e450a51975131907dd92bd257a3c4dc368deb024a0e7fc02233f99"

RPROVIDES:${PN} += "liballegro_primitives.so.5.2()(64bit) liballegro_primitives5_2 liballegro_primitives5_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenGL.so.0()(64bit) liballegro.so.5.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
