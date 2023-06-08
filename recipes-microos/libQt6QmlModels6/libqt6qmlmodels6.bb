SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlModels6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "d142d8014d0bcc4e1cfae62bea28ff1361c73e34dd4141a145adf624a085dd3bf74bb9313bbdaa0187ffff7c51099e829f84c4e238d2ee211d4590e13b3d25fc"

RPROVIDES:${PN} += "libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6)(64bit) libQt6QmlModels.so.6(Qt_6.0)(64bit) libQt6QmlModels.so.6(Qt_6.1)(64bit) libQt6QmlModels.so.6(Qt_6.2)(64bit) libQt6QmlModels.so.6(Qt_6.3)(64bit) libQt6QmlModels.so.6(Qt_6.4)(64bit) libQt6QmlModels.so.6(Qt_6.5)(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlModels6 libQt6QmlModels6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
