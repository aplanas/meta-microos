SUMMARY = "KDE PIM libraries MIME Support"
DESCRIPTION = "This package provides MIME support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Mime5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7667050e81b35cdaaa8fbeae7ba3e3e91a22c3a13ff19532d88030b6ec79a2509f6b8432cf6eb7dbdaad836dc6a8421083617fcbbbfda595f0e37a8acef6d16e"

RPROVIDES:${PN} += "libKPim5Mime.so.5()(64bit) libKPim5Mime5 libKPim5Mime5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
