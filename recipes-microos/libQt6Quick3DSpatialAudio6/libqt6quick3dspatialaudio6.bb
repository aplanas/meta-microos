SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "524e422f76ebcbe54754d9f6d3ea35fed5ecbe17ee9483cf3fe16508a1719892cd5a063d898b390ae8c77cb724d3db60f4fffe5c3b67210b0a3ce8b3bd908908"

RPROVIDES:${PN} += "libQt6Quick3DSpatialAudio.so.6()(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.0)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.1)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.2)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.3)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.4)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.5)(64bit) \
libQt6Quick3DSpatialAudio.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DSpatialAudio6 \
libQt6Quick3DSpatialAudio6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6SpatialAudio.so.6()(64bit) \
libQt6SpatialAudio.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
