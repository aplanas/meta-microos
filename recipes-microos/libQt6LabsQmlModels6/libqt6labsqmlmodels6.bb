SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6LabsQmlModels6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "6dadbf1844d9ac2466db2891304b8ed4e870342ea1fb89e6692c947d1fad7b443aedf1f3f0770e3d62b4f488a801526d202294e169b13e7b62134291fae3614b"

RPROVIDES:${PN} += "libQt6LabsQmlModels.so.6()(64bit) libQt6LabsQmlModels.so.6(Qt_6)(64bit) libQt6LabsQmlModels.so.6(Qt_6.0)(64bit) libQt6LabsQmlModels.so.6(Qt_6.1)(64bit) libQt6LabsQmlModels.so.6(Qt_6.2)(64bit) libQt6LabsQmlModels.so.6(Qt_6.3)(64bit) libQt6LabsQmlModels.so.6(Qt_6.4)(64bit) libQt6LabsQmlModels.so.6(Qt_6.5)(64bit) libQt6LabsQmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LabsQmlModels6 libQt6LabsQmlModels6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
