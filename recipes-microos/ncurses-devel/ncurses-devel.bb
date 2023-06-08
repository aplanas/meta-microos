SUMMARY = "Development files for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses-devel-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "3e640e5d81512bae6a94996824601029543b9e0a87e24db9aff03a8b18e98d8c77eb19f5d34a7c8dfe3be5d183fe1149d963ae4fbaf33876977b08b4d7ce823d"

RPROVIDES:${PN} += "ncurses-devel ncurses-devel(aarch-64) ncurses6-devel ncurses:/usr/include/ncurses.h pkgconfig(form) pkgconfig(formw) pkgconfig(menu) pkgconfig(menuw) pkgconfig(ncurses) pkgconfig(ncurses++) pkgconfig(ncurses++w) pkgconfig(ncursesw) pkgconfig(panel) pkgconfig(panelw) pkgconfig(tic) pkgconfig(tinfo)"
RDEPENDS:${PN} += "/usr/bin/bash /usr/bin/pkg-config /usr/bin/tack ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses6 libticw.so.6()(64bit) libticw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) libticw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) libticw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) libticw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) libticw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) libtinfo.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) ncurses"

inherit rpm
