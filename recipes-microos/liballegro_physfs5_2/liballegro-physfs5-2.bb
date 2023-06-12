SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_physfs5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "056336fdacc82b41a37a234d0300972e2dda0c5196eddc7e06f1d0c225b6cc0bdc3045a73fb9cec93d749afa0ca02e452ee7916552c81d32b393546f64c22ba5"

RPROVIDES:${PN} += "liballegro_physfs.so.5.2()(64bit) \
liballegro_physfs5_2 \
liballegro_physfs5_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballegro.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libphysfs.so.1()(64bit)"

inherit rpm
