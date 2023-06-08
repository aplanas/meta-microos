SUMMARY = "Ping and Traceroute Network Diagnostic Tool"
DESCRIPTION = "Mtr is a network diagnostic tool which combines Ping and Traceroute \
into one program. This package contains mtr with a GTK interface. \
You'll find the text mode version in the mtr package."
LICENSE = "GPL-2.0-only"

PV = "0.95"

RPM_NAME = "mtr-gtk-0.95-2.1.aarch64.rpm"
RPM_HASH = "adec19ad843a3a0bc33a01a69ba4cf37d03be9728bf8f457cab9763f50d3f2e05282713084c496ed5e1352f61e9f0688e9af729a22dafdb5e571670830f0bf03"

RPROVIDES:${PN} += "application() application(xmtr.desktop) mtr-gtk mtr-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) mtr xdg-utils"

inherit rpm
