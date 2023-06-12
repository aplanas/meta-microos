SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e64a6b06cabbb2a1086de66820bb1afe0be883478e7b147aae0616e6d8e933b4c464493d1ba489ae1f01d97a087698fe9d40c64cd552942d51f96018b5d3c5a4"

RPROVIDES:${PN} += "libQt6LabsWavefrontMesh.so.6()(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.0)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.1)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.2)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.3)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.4)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.5)(64bit) libQt6LabsWavefrontMesh.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6LabsWavefrontMesh6 libQt6LabsWavefrontMesh6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
