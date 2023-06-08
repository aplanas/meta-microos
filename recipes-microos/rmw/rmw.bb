SUMMARY = "Safe-remove utility for the command line"
DESCRIPTION = "rmw (ReMove to Waste) is a safe-remove utility for the command line. It \
can move and restore files to and from directories specified in a \
configuration file, and can also be integrated with your regular \
desktop trash folder (if your desktop environment uses the \
FreeDesktop.org Trash specification). One of the unique features of rmw \
is the ability to purge items from your waste (or trash) directories \
after x number of days."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "rmw-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "19664f1eb60fffe889abeb0d3a307186820882aca02bcc5dc4f6f24ac300fa9edb03f62b9b9faacdf5ae1567f9262fd1f79d3100bd9afcd0e7a79eb7eacd518f"

RPROVIDES:${PN} += "rmw rmw(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmenuw.so.6()(64bit) libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
