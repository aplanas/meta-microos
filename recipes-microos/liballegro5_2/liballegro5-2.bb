SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "f4ae15372281947750f8017e8e56083a40f179435943b161ae7e4a26f41b70a2e7881c3ce2d237be1e953a0135afc5b4734556124f2806b8c4bf1ecf9468abff"

RPROVIDES:${PN} += "config(liballegro5_2) liballegro.so.5.2()(64bit) liballegro5_2 liballegro5_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLX.so.0()(64bit) libOpenGL.so.0()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
