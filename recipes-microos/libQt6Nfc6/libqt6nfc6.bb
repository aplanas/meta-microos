SUMMARY = "Qt 6 NFC library"
DESCRIPTION = "Provides access to NFC hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Nfc6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b9b09fe648bbd5af29278a30eac4995a5d3520515ee42672a28c14369535c29104814a9a0551180d58e63d1066fac95e00f12338d2bdf3b123b3d0d1615ec7df"

RPROVIDES:${PN} += "libQt6Nfc.so.6()(64bit) libQt6Nfc.so.6(Qt_6)(64bit) libQt6Nfc.so.6(Qt_6.0)(64bit) libQt6Nfc.so.6(Qt_6.1)(64bit) libQt6Nfc.so.6(Qt_6.2)(64bit) libQt6Nfc.so.6(Qt_6.3)(64bit) libQt6Nfc.so.6(Qt_6.4)(64bit) libQt6Nfc.so.6(Qt_6.5)(64bit) libQt6Nfc.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Nfc6 libQt6Nfc6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpcsclite.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
