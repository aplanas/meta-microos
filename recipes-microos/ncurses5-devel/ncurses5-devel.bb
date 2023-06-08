SUMMARY = "Development files for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the headers needed to build against \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses5-devel-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "dfcc49ba53e3195c0e7784bdf183e26fc824b2596ba83c42dbea39696f924b7d24d3f05a4c54a451c1692a0cbd9f53df887563a25dc313009a6ba6f676ac88d4"

RPROVIDES:${PN} += "ncurses5-devel ncurses5-devel(aarch-64) ncurses:/usr/include/ncurses5/ncurses.h pkgconfig(form5) pkgconfig(formw5) pkgconfig(menu5) pkgconfig(menuw5) pkgconfig(ncurses++5) pkgconfig(ncurses++w5) pkgconfig(ncurses5) pkgconfig(ncursesw5) pkgconfig(panel5) pkgconfig(panelw5) pkgconfig(tic5) pkgconfig(tinfo5)"
RDEPENDS:${PN} += "/usr/bin/bash /usr/bin/pkg-config /usr/bin/tack libncurses5 ncurses ncurses-devel"

inherit rpm
