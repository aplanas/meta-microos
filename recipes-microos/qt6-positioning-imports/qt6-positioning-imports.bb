SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6b7e17f1f76b3a611433d7b42621f98dca65addc29785bc0cbf14a8fce93254111c63c0c5e71b3bcf0b12b8097268dcde24a5744f2edce75cc706e25756d0de0"

RPROVIDES:${PN} += "libpositioningquickplugin.so()(64bit) \
libpositioningquickplugin.so(Qt_6)(64bit) \
libpositioningquickplugin.so(Qt_6.0)(64bit) \
libpositioningquickplugin.so(Qt_6.1)(64bit) \
libpositioningquickplugin.so(Qt_6.2)(64bit) \
libpositioningquickplugin.so(Qt_6.3)(64bit) \
libpositioningquickplugin.so(Qt_6.4)(64bit) \
libpositioningquickplugin.so(Qt_6.5)(64bit) \
libpositioningquickplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-location-imports \
qt6-positioning-imports \
qt6-positioning-imports(aarch-64) \
qt6qmlimport(QtPositioning.2) \
qt6qmlimport(QtPositioning.5) \
qt6qmlimport(QtPositioning.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6PositioningQuick.so.6()(64bit) \
libQt6PositioningQuick.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
