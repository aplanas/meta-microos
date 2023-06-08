SUMMARY = "Qt 6 Positioning QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c3744adfe02b45bd296a2fc4abc04370b8a9d2084b347417d233ecb464dbd361f55ec7eb404ceb197b3f178515c1a4edf228dada57c56260b029923268a8f40c"

RPROVIDES:${PN} += "libpositioningquickplugin.so()(64bit) libpositioningquickplugin.so(Qt_6)(64bit) libpositioningquickplugin.so(Qt_6.0)(64bit) libpositioningquickplugin.so(Qt_6.1)(64bit) libpositioningquickplugin.so(Qt_6.2)(64bit) libpositioningquickplugin.so(Qt_6.3)(64bit) libpositioningquickplugin.so(Qt_6.4)(64bit) libpositioningquickplugin.so(Qt_6.5)(64bit) libpositioningquickplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-location-imports qt6-positioning-imports qt6-positioning-imports(aarch-64) qt6qmlimport(QtPositioning.2) qt6qmlimport(QtPositioning.5) qt6qmlimport(QtPositioning.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6PositioningQuick.so.6()(64bit) libQt6PositioningQuick.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
