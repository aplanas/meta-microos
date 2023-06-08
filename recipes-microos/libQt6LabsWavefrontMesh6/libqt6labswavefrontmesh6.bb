SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "724706d7950be4d76bcef9fa38c6d86afdd4fa22e2e2350088b561e53407824615ffeda08a63e20a7a6bc312254adcb9de2a99b2c07f15920ffe622a5abed40a"

RPROVIDES:${PN} += "libQt6LabsWavefrontMesh.so.6()(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.0)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.1)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.2)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.3)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.4)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.5)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LabsWavefrontMesh6 libQt6LabsWavefrontMesh6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
