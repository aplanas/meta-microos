SUMMARY = "The LAME MP3 encoder"
DESCRIPTION = "LAME is an educational tool to be used for learning about MP3 encoding. \
The goal of the LAME project is to use the open source model to improve the \
psycho acoustics, noise shaping and speed of MP3. \
Another goal of the LAME project is to use these improvements for the basis of \
a patent free audio compression codec for the GNU project."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-3.100-5.3.aarch64.rpm"
RPM_HASH = "ab0bf36a4b573b14c988c934a26a670f84f6399008171e80bcc24c1b56f604e5045269d144c159858eb61bd62efd1f45a52a3fe0536510aaf15d11bf610c1c70"

RPROVIDES:${PN} += "lame lame(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmp3lame.so.0()(64bit) libmp3lame0 libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
