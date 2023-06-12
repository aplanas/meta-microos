SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Nfc6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "990301419f81472bb8708731870ce6edcb610246479a4f4e253a26b432542fbee2f7371b4b95ba5d9e2ea6ba07ff6facd7bb000e8a12cc3bbefe552ede0163c6"

RPROVIDES:${PN} += "libQt6Nfc.so.6()(64bit) libQt6Nfc.so.6(Qt_6)(64bit) libQt6Nfc.so.6(Qt_6.0)(64bit) libQt6Nfc.so.6(Qt_6.1)(64bit) libQt6Nfc.so.6(Qt_6.2)(64bit) libQt6Nfc.so.6(Qt_6.3)(64bit) libQt6Nfc.so.6(Qt_6.4)(64bit) libQt6Nfc.so.6(Qt_6.5)(64bit) libQt6Nfc.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Nfc6 libQt6Nfc6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpcsclite.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
