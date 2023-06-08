SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5GAPIMaps5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4668c9056aadb95cd5778aca199d39a77f14985843c14645a2449016d9ae9202e512859fb6101118e10ff3f42b86f35d261b7f77a78a164ae9f650af2d1e328f"

RPROVIDES:${PN} += "libKPim5GAPIMaps.so.5()(64bit) libKPim5GAPIMaps5 libKPim5GAPIMaps5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Contacts.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
