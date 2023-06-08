SUMMARY = "Qt 6 Multimedia QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Multimedia module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-imports-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "ae64fab35d75b44d560fc7423a7bf1a60f2addb2e8b000665ed4cc72f0f1a4d1b7047c329318c3c1669d3c2dd19539521da47078c72da89b192dbfa31363c339"

RPROVIDES:${PN} += "libquick3dspatialaudioplugin.so()(64bit) libquick3dspatialaudioplugin.so(Qt_6)(64bit) libquick3dspatialaudioplugin.so(Qt_6.0)(64bit) libquick3dspatialaudioplugin.so(Qt_6.1)(64bit) libquick3dspatialaudioplugin.so(Qt_6.2)(64bit) libquick3dspatialaudioplugin.so(Qt_6.3)(64bit) libquick3dspatialaudioplugin.so(Qt_6.4)(64bit) libquick3dspatialaudioplugin.so(Qt_6.5)(64bit) libquick3dspatialaudioplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libquickmultimediaplugin.so()(64bit) libquickmultimediaplugin.so(Qt_6)(64bit) libquickmultimediaplugin.so(Qt_6.0)(64bit) libquickmultimediaplugin.so(Qt_6.1)(64bit) libquickmultimediaplugin.so(Qt_6.2)(64bit) libquickmultimediaplugin.so(Qt_6.3)(64bit) libquickmultimediaplugin.so(Qt_6.4)(64bit) libquickmultimediaplugin.so(Qt_6.5)(64bit) libquickmultimediaplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-multimedia-imports qt6-multimedia-imports(aarch-64) qt6qmlimport(QtMultimedia.2) qt6qmlimport(QtMultimedia.5) qt6qmlimport(QtMultimedia.6) qt6qmlimport(QtQuick3D.SpatialAudio.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6MultimediaQuick.so.6()(64bit) libQt6MultimediaQuick.so.6(Qt_6)(64bit) libQt6MultimediaQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3DSpatialAudio.so.6()(64bit) libQt6Quick3DSpatialAudio.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
