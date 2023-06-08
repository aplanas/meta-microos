SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5Baloo5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "17574815e221154d789ac943ae2d8b481b496f011f032396b4fa0333ebaade2d73005558811574f2ae5d32c4d9d3543bbd1606d2239aad2aef77317157b2e467"

RPROVIDES:${PN} += "baloo5-lang libKF5Baloo.so.5()(64bit) libKF5Baloo5 libKF5Baloo5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5BalooEngine.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
