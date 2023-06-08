SUMMARY = "Spreadsheet Calculator"
DESCRIPTION = "sc is a free curses-based spreadsheet program that uses key bindings similar to \
vi and less."
LICENSE = "SUSE-Public-Domain"

PV = "7.16"

RPM_NAME = "sc-7.16-13.29.aarch64.rpm"
RPM_HASH = "a55bef0cd37a145de707dc5869251d38c2d82cfc611e9d95d282ecb54fe5fa042794d9074f039b1df80ec40f9fa1b7b08f0c24ca19cc3f0a961ec9f844105c33"

RPROVIDES:${PN} += "sc sc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
