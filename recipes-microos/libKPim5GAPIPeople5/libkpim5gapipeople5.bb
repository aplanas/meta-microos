SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPIPeople5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bb8ca7903619b636b94118868d3a88005ba98cf25c44d59513ab382d34464c8cb212e69d59ba5c236db8e2c2008a2defff7a975f27f8affdf10c843bf618902a"

RPROVIDES:${PN} += "libKPim5GAPIPeople.so.5()(64bit) \
libKPim5GAPIPeople5 \
libKPim5GAPIPeople5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Contacts.so.5()(64bit) \
libKPim5GAPICore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
