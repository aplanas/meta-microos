SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for \
applications to fetch and submit audio CD \
information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKF5Cddb5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6c5a25b6661e4dbcdd8770470dedf2b615142653dbba157baf977877e03ff7a24497896a42009df4929b9114bb4364ea63d97c7cb6e168fe9a24dc5629b58a88"

RPROVIDES:${PN} += "libKF5Cddb.so.5()(64bit) libKF5Cddb5 libKF5Cddb5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmusicbrainz5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
