SUMMARY = "A tool to perform actions on windows"
DESCRIPTION = "The tool lets you perform actions such as inspect, raise, lower, inject input on \
X11 windows. Xdo is compatible with both Xorg and Xwayland."
LICENSE = "BSD-2-Clause"

PV = "0.5.7"

RPM_NAME = "xdo-0.5.7-1.7.aarch64.rpm"
RPM_HASH = "92e4b159779737947369d467a8ba252846ccbe26a980abc926823678a58fdae21b27b44ea5d0784708687456f68ead2a34aeeb7994377cccb3f379784f1580f2"

RPROVIDES:${PN} += "xdo xdo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxcb-ewmh.so.2()(64bit) libxcb-icccm.so.4()(64bit) libxcb-util.so.1()(64bit) libxcb-xtest.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
