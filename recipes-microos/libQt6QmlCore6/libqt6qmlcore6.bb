SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlCore6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "bf8ad3e86f4b2044d18c4e580b41998b8c818f9802a9cb4717bd44f48aacaf220fc96c05ae275ce3fcaacb511bb9b95fdc1e480330ba80320284986d6e78fd96"

RPROVIDES:${PN} += "libQt6QmlCore.so.6()(64bit) libQt6QmlCore.so.6(Qt_6)(64bit) libQt6QmlCore.so.6(Qt_6.0)(64bit) libQt6QmlCore.so.6(Qt_6.1)(64bit) libQt6QmlCore.so.6(Qt_6.2)(64bit) libQt6QmlCore.so.6(Qt_6.3)(64bit) libQt6QmlCore.so.6(Qt_6.4)(64bit) libQt6QmlCore.so.6(Qt_6.5)(64bit) libQt6QmlCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlCore6 libQt6QmlCore6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt6-declarative-imports"

inherit rpm
