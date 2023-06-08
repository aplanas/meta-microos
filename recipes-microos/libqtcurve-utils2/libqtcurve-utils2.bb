SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains basic helper library needed for qtcurve."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-utils2-1.9.0-6.16.aarch64.rpm"
RPM_HASH = "6eec9d7fe29cf1ba0f47de34db40875655b460dff25fd322a71cf9baa8b66091268731148148b2157c423d638cc10dd57e9d43abcf97a50aa90a18ac46d798db"

RPROVIDES:${PN} += "libqtcurve-utils.so.2()(64bit) libqtcurve-utils2 libqtcurve-utils2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxcb.so.1()(64bit)"

inherit rpm
