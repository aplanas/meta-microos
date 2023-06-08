SUMMARY = "Qt Library that wraps the gpodder.net Web API"
DESCRIPTION = "libmygpo-qt5 is a Qt Library that wraps the gpodder.net Web API (http://wiki.gpodder.org/wiki/Web_Services/API_2) \
 \
v1.0 wraps nearly every Request from the gpodder.net API except: \
- Simple API Calls Downloading subscription Lists & Uploading subscription Lists \
- Retrieving Subscription Changes (you should use 'Retrieving Updates for a given Device' instead)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmygpo-qt5-1-1.1.0-2.23.aarch64.rpm"
RPM_HASH = "65e0ec4ffcd928dc0ad9f48106a3550b7b1686931736d8b8f30f5d600f8c41eb528b40abe40a533721cc1f7670798849a734b8666a07837ab31cbffe1f88e664"

RPROVIDES:${PN} += "libmygpo-qt5-1 libmygpo-qt5-1(aarch-64) libmygpo-qt5.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
