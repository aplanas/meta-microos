SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5BalooEngine5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "24d7a9bac7bc72c210a3680f4abe22a19bbc0984a4a609a374d831d337ce07178d504c51a55a05bb6940822259a7d5b85fdfac793a312bc9cf4b8d2b3923e49a"

RPROVIDES:${PN} += "libKF5BalooEngine.so.5()(64bit) libKF5BalooEngine5 libKF5BalooEngine5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) liblmdb-0.9.30.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
