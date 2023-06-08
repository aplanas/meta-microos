SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5GAPIPeople5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1c9942ea138146f860bd7eac08f3301e7ca7623dd5dedcd4e8868737ecc1d0a24e80e6bc7628ec7b9f01594f0a7a0f208dbd540b47559d0e1743d85761664f66"

RPROVIDES:${PN} += "libKPim5GAPIPeople.so.5()(64bit) libKPim5GAPIPeople5 libKPim5GAPIPeople5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Contacts.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
