SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5GAPILatitude5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9e5271a5247f47752b2d9c0ba866a7dca41c7a1587d3cb0724dddd55397a36f43177563983a4a6fc0692e76888934f1bec8649a69266556a1bd200034a50578f"

RPROVIDES:${PN} += "libKPim5GAPILatitude.so.5()(64bit) libKPim5GAPILatitude5 libKPim5GAPILatitude5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Contacts.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
