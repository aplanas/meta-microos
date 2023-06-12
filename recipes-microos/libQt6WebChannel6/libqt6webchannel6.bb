SUMMARY = "Qt 6 WebChannel library"
DESCRIPTION = "The Qt 6 WebChannel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebChannel6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "12a57ec66787f57b5a90c206dd1949581d47d201f92baa1f80ac5f94954056fb12593518d08be5e6c412e71e804f931fed0a3539a89bd4c9d79fbb65f4ae4180"

RPROVIDES:${PN} += "libQt6WebChannel.so.6()(64bit) libQt6WebChannel.so.6(Qt_6)(64bit) libQt6WebChannel.so.6(Qt_6.0)(64bit) libQt6WebChannel.so.6(Qt_6.1)(64bit) libQt6WebChannel.so.6(Qt_6.2)(64bit) libQt6WebChannel.so.6(Qt_6.3)(64bit) libQt6WebChannel.so.6(Qt_6.4)(64bit) libQt6WebChannel.so.6(Qt_6.5)(64bit) libQt6WebChannel.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6WebChannel6 libQt6WebChannel6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
