SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Nfc5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "80e1ef1a113c1b378c43b7425385851c33f21be444f8addd0dc477db27738b093413b483914bd481767a4066336fa51a515f49be36d3dc651ff71b4b1da6a3c2"

RPROVIDES:${PN} += "libQt5Nfc.so.5()(64bit) \
libQt5Nfc.so.5(Qt_5)(64bit) \
libQt5Nfc.so.5(Qt_5.0)(64bit) \
libQt5Nfc.so.5(Qt_5.1)(64bit) \
libQt5Nfc.so.5(Qt_5.10)(64bit) \
libQt5Nfc.so.5(Qt_5.11)(64bit) \
libQt5Nfc.so.5(Qt_5.12)(64bit) \
libQt5Nfc.so.5(Qt_5.13)(64bit) \
libQt5Nfc.so.5(Qt_5.14)(64bit) \
libQt5Nfc.so.5(Qt_5.15)(64bit) \
libQt5Nfc.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Nfc.so.5(Qt_5.2)(64bit) \
libQt5Nfc.so.5(Qt_5.3)(64bit) \
libQt5Nfc.so.5(Qt_5.4)(64bit) \
libQt5Nfc.so.5(Qt_5.5)(64bit) \
libQt5Nfc.so.5(Qt_5.6)(64bit) \
libQt5Nfc.so.5(Qt_5.7)(64bit) \
libQt5Nfc.so.5(Qt_5.8)(64bit) \
libQt5Nfc.so.5(Qt_5.9)(64bit) \
libQt5Nfc5 \
libQt5Nfc5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
