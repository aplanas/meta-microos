SUMMARY = "Qt 6 Protobuf library"
DESCRIPTION = "The Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Protobuf6-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "763d6d0e245019307a9e98e5fa38d887d70190ee616e427070b9fc34e4a45f2b16cdec71347fc579042827e07221a2c554f52c9ecc7744860b69d0a071133237"

RPROVIDES:${PN} += "libQt6Protobuf.so.6()(64bit) libQt6Protobuf.so.6(Qt_6)(64bit) libQt6Protobuf.so.6(Qt_6.0)(64bit) libQt6Protobuf.so.6(Qt_6.1)(64bit) libQt6Protobuf.so.6(Qt_6.2)(64bit) libQt6Protobuf.so.6(Qt_6.3)(64bit) libQt6Protobuf.so.6(Qt_6.4)(64bit) libQt6Protobuf.so.6(Qt_6.5)(64bit) libQt6Protobuf.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Protobuf6 libQt6Protobuf6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
