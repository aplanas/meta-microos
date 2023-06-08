SUMMARY = "Qt 5 3D Library - QML imports"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "6aaa2a43e6114364ae05f6e711363211a430c1adb7f04d7fb555e5c9450d5e9bfd4d098e3118b4471d4837fc90815b1b3a712716d88e69e140c5da2b9f8c9323"

RPROVIDES:${PN} += "libqt5-qt3d-imports libqt5-qt3d-imports(aarch-64) libqtquickscene2dplugin.so()(64bit) libqtquickscene3dplugin.so()(64bit) libquick3danimationplugin.so()(64bit) libquick3dcoreplugin.so()(64bit) libquick3dextrasplugin.so()(64bit) libquick3dinputplugin.so()(64bit) libquick3dlogicplugin.so()(64bit) libquick3drenderplugin.so()(64bit) qt5qmlimport(Qt3D.Animation.2) qt5qmlimport(Qt3D.Core.2) qt5qmlimport(Qt3D.Extras.2) qt5qmlimport(Qt3D.Input.2) qt5qmlimport(Qt3D.Logic.2) qt5qmlimport(Qt3D.Render.2) qt5qmlimport(QtQuick.Scene2D.2) qt5qmlimport(QtQuick.Scene3D.2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt53DAnimation.so.5()(64bit) libQt53DAnimation.so.5(Qt_5)(64bit) libQt53DCore.so.5()(64bit) libQt53DCore.so.5(Qt_5)(64bit) libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DExtras.so.5()(64bit) libQt53DExtras.so.5(Qt_5)(64bit) libQt53DInput.so.5()(64bit) libQt53DInput.so.5(Qt_5)(64bit) libQt53DLogic.so.5()(64bit) libQt53DLogic.so.5(Qt_5)(64bit) libQt53DQuick.so.5()(64bit) libQt53DQuick.so.5(Qt_5)(64bit) libQt53DQuick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DQuickAnimation.so.5()(64bit) libQt53DQuickAnimation.so.5(Qt_5)(64bit) libQt53DQuickAnimation.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DQuickExtras.so.5()(64bit) libQt53DQuickExtras.so.5(Qt_5)(64bit) libQt53DQuickExtras.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DQuickInput.so.5()(64bit) libQt53DQuickInput.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DQuickRender.so.5()(64bit) libQt53DQuickRender.so.5(Qt_5)(64bit) libQt53DQuickRender.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DQuickScene2D.so.5()(64bit) libQt53DQuickScene2D.so.5(Qt_5)(64bit) libQt53DQuickScene2D.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DRender.so.5()(64bit) libQt53DRender.so.5(Qt_5)(64bit) libQt53DRender.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
