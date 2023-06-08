SUMMARY = "Chinese Board Game 'Go'"
DESCRIPTION = "Chinese ancient board game."
LICENSE = "GPL-3.0-or-later"

PV = "1371149103.84a32e9c"

RPM_NAME = "gnugo-1371149103.84a32e9c-1.18.aarch64.rpm"
RPM_HASH = "533ae50e0f28a3d33a0e5e59cfe4a46720007521f432c9e8453a5d21b9816b427e0bbc1808a37dc68a32185f8537e9ad71f2122a6081dab6784df243f2cd9f68"

RPROVIDES:${PN} += "gnugo gnugo(aarch-64)"
RDEPENDS:${PN} += "/bin/sh info ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
