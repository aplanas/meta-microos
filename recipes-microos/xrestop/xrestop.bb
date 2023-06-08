SUMMARY = "Utility to monitor server resources used by X11 clients"
DESCRIPTION = "XResTop is a 'top' like tool for monitoring X Client server resource \
usage."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "xrestop-0.6-1.1.aarch64.rpm"
RPM_HASH = "ce3946b015db34a6d38db402ea10c13ff6317f1af4eebb67151385530c4d697632f57d20998f5b1804ce70720947f406fef1408fe89e2ba37fbbbdc5eccc7b15"

RPROVIDES:${PN} += "xrestop xrestop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXRes.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
