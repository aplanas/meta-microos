SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5BalooEngine5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cefc15c4e4c3dc1e27b4e97ad732ef5d6d0f096ce65c130d97cd2310ff81f880e0ef2259b41dc1dafc5c96d7a758acee2a2f81060e54d9602bacf86996890d0d"

RPROVIDES:${PN} += "libKF5BalooEngine.so.5()(64bit) libKF5BalooEngine5 libKF5BalooEngine5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) liblmdb-0.9.30.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
