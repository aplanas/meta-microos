SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "58d917da5a8915a242a46b4c4d54aa97abecd6104332bc19ab7219638d0d8399ba65d63286796e91dbcaef2bcf4d2a5980c2e721d1f1d42cb5b048c2e71c5ea4"

RPROVIDES:${PN} += "libQt6Quick3DSpatialAudio.so.6()(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.0)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.1)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.2)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.3)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.4)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.5)(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DSpatialAudio6 libQt6Quick3DSpatialAudio6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Multimedia.so.6()(64bit) libQt6Multimedia.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SpatialAudio.so.6()(64bit) libQt6SpatialAudio.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
