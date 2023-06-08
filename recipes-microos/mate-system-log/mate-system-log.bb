SUMMARY = "MATE system log viewer"
DESCRIPTION = "This is the MATE system log viewer as shipped with the MATE utilities. \
mate-system-log is a program which can view logs generated by the \
operating system."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-system-log-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "7e83d0ebfe62e9eb5651a49cf7a1b2d4a6d24e0479bdffe6563b973f8404cbfb6470a5a912e2a90473de2d39323e8f91c361a22e74d5652dfed5e2d014f22891"

RPROVIDES:${PN} += "application() application(mate-system-log.desktop) mate-system-log mate-system-log(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libz.so.1()(64bit) mate-desktop-gschemas"

inherit rpm
