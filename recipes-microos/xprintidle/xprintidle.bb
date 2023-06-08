SUMMARY = "Utility to print user's idle time in X"
DESCRIPTION = "An utility that queries the X server for the user's idle time and \
prints it to stdout (in milliseconds)."
LICENSE = "GPL-2.0"

PV = "0.2"

RPM_NAME = "xprintidle-0.2-1.24.aarch64.rpm"
RPM_HASH = "1586cb2ac6970259f7199cb37167ab8cd7f2fb9498196ed44a414e44e7692894cdcd2b74761e7618faa0af46eb3c634c1903f616679da81c92844d5f4820c246"

RPROVIDES:${PN} += "xprintidle xprintidle(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXss.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
