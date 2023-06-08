SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Syndication5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1e1e7343e14b2c77a860fc51c774c6b5a4ce48ddd612b9012cf0a5f4da0b4d66876700f739243882744757b6538a1c89aa8eb770b146bf9352850ef925f0b050"

RPROVIDES:${PN} += "libKF5Syndication.so.5()(64bit) libKF5Syndication5 libKF5Syndication5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
