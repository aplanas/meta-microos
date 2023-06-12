SUMMARY = "A client library for the LibreGraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libLibreGraphAPI1-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "513c4b112d5eae4f63602cf06186082c46e634e9991cdc8540da0182cb836d406513a916619bc9563d9fb68f51881d80bc96e723cf95fffeab8e7c9eabae70fb"

RPROVIDES:${PN} += "libLibreGraphAPI.so.1()(64bit) libLibreGraphAPI1 libLibreGraphAPI1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
