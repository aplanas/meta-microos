SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlCore6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "dc006b044bae95e170eb758bba0b543bbb029278128ee1867b5108d9320af727b370e3ade2eeeebc7b5904b787f37d15d77000ca2c35817bbaaabc7604eaa113"

RPROVIDES:${PN} += "libQt6QmlCore.so.6()(64bit) libQt6QmlCore.so.6(Qt_6)(64bit) libQt6QmlCore.so.6(Qt_6.0)(64bit) libQt6QmlCore.so.6(Qt_6.1)(64bit) libQt6QmlCore.so.6(Qt_6.2)(64bit) libQt6QmlCore.so.6(Qt_6.3)(64bit) libQt6QmlCore.so.6(Qt_6.4)(64bit) libQt6QmlCore.so.6(Qt_6.5)(64bit) libQt6QmlCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6QmlCore6 libQt6QmlCore6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt6-declarative-imports"

inherit rpm
