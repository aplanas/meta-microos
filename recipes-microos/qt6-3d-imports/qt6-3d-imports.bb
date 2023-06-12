SUMMARY = "Qt 6 3D Library - QML imports"
DESCRIPTION = "Qt 6 3D QML imports."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "39bd72ac4b4f71e12641773a450c568df5b5c3c353cab030f7590d28ea96ad0179579d5e45dd40b1db262452a0245e293b1a6546f40aab14fb8a085c9f132a71"

RPROVIDES:${PN} += "libqtquickscene2dplugin.so()(64bit) \
libqtquickscene2dplugin.so(Qt_6)(64bit) \
libqtquickscene2dplugin.so(Qt_6.0)(64bit) \
libqtquickscene2dplugin.so(Qt_6.1)(64bit) \
libqtquickscene2dplugin.so(Qt_6.2)(64bit) \
libqtquickscene2dplugin.so(Qt_6.3)(64bit) \
libqtquickscene2dplugin.so(Qt_6.4)(64bit) \
libqtquickscene2dplugin.so(Qt_6.5)(64bit) \
libqtquickscene2dplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtquickscene3dplugin.so()(64bit) \
libqtquickscene3dplugin.so(Qt_6)(64bit) \
libqtquickscene3dplugin.so(Qt_6.0)(64bit) \
libqtquickscene3dplugin.so(Qt_6.1)(64bit) \
libqtquickscene3dplugin.so(Qt_6.2)(64bit) \
libqtquickscene3dplugin.so(Qt_6.3)(64bit) \
libqtquickscene3dplugin.so(Qt_6.4)(64bit) \
libqtquickscene3dplugin.so(Qt_6.5)(64bit) \
libqtquickscene3dplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3danimationplugin.so()(64bit) \
libquick3danimationplugin.so(Qt_6)(64bit) \
libquick3danimationplugin.so(Qt_6.0)(64bit) \
libquick3danimationplugin.so(Qt_6.1)(64bit) \
libquick3danimationplugin.so(Qt_6.2)(64bit) \
libquick3danimationplugin.so(Qt_6.3)(64bit) \
libquick3danimationplugin.so(Qt_6.4)(64bit) \
libquick3danimationplugin.so(Qt_6.5)(64bit) \
libquick3danimationplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3dcoreplugin.so()(64bit) \
libquick3dcoreplugin.so(Qt_6)(64bit) \
libquick3dcoreplugin.so(Qt_6.0)(64bit) \
libquick3dcoreplugin.so(Qt_6.1)(64bit) \
libquick3dcoreplugin.so(Qt_6.2)(64bit) \
libquick3dcoreplugin.so(Qt_6.3)(64bit) \
libquick3dcoreplugin.so(Qt_6.4)(64bit) \
libquick3dcoreplugin.so(Qt_6.5)(64bit) \
libquick3dcoreplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3dextrasplugin.so()(64bit) \
libquick3dextrasplugin.so(Qt_6)(64bit) \
libquick3dextrasplugin.so(Qt_6.0)(64bit) \
libquick3dextrasplugin.so(Qt_6.1)(64bit) \
libquick3dextrasplugin.so(Qt_6.2)(64bit) \
libquick3dextrasplugin.so(Qt_6.3)(64bit) \
libquick3dextrasplugin.so(Qt_6.4)(64bit) \
libquick3dextrasplugin.so(Qt_6.5)(64bit) \
libquick3dextrasplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3dinputplugin.so()(64bit) \
libquick3dinputplugin.so(Qt_6)(64bit) \
libquick3dinputplugin.so(Qt_6.0)(64bit) \
libquick3dinputplugin.so(Qt_6.1)(64bit) \
libquick3dinputplugin.so(Qt_6.2)(64bit) \
libquick3dinputplugin.so(Qt_6.3)(64bit) \
libquick3dinputplugin.so(Qt_6.4)(64bit) \
libquick3dinputplugin.so(Qt_6.5)(64bit) \
libquick3dinputplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3dlogicplugin.so()(64bit) \
libquick3dlogicplugin.so(Qt_6)(64bit) \
libquick3dlogicplugin.so(Qt_6.0)(64bit) \
libquick3dlogicplugin.so(Qt_6.1)(64bit) \
libquick3dlogicplugin.so(Qt_6.2)(64bit) \
libquick3dlogicplugin.so(Qt_6.3)(64bit) \
libquick3dlogicplugin.so(Qt_6.4)(64bit) \
libquick3dlogicplugin.so(Qt_6.5)(64bit) \
libquick3dlogicplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libquick3drenderplugin.so()(64bit) \
libquick3drenderplugin.so(Qt_6)(64bit) \
libquick3drenderplugin.so(Qt_6.0)(64bit) \
libquick3drenderplugin.so(Qt_6.1)(64bit) \
libquick3drenderplugin.so(Qt_6.2)(64bit) \
libquick3drenderplugin.so(Qt_6.3)(64bit) \
libquick3drenderplugin.so(Qt_6.4)(64bit) \
libquick3drenderplugin.so(Qt_6.5)(64bit) \
libquick3drenderplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-3d-imports \
qt6-3d-imports(aarch-64) \
qt6qmlimport(Qt3D.Animation.2) \
qt6qmlimport(Qt3D.Core.2) \
qt6qmlimport(Qt3D.Core.6) \
qt6qmlimport(Qt3D.Extras.2) \
qt6qmlimport(Qt3D.Input.2) \
qt6qmlimport(Qt3D.Logic.2) \
qt6qmlimport(Qt3D.Render.2) \
qt6qmlimport(QtQuick.Scene2D.2) \
qt6qmlimport(QtQuick.Scene3D.2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt63DAnimation.so.6()(64bit) \
libQt63DAnimation.so.6(Qt_6)(64bit) \
libQt63DCore.so.6()(64bit) \
libQt63DCore.so.6(Qt_6)(64bit) \
libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DExtras.so.6()(64bit) \
libQt63DExtras.so.6(Qt_6)(64bit) \
libQt63DInput.so.6()(64bit) \
libQt63DInput.so.6(Qt_6)(64bit) \
libQt63DLogic.so.6()(64bit) \
libQt63DLogic.so.6(Qt_6)(64bit) \
libQt63DQuick.so.6()(64bit) \
libQt63DQuick.so.6(Qt_6)(64bit) \
libQt63DQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickAnimation.so.6()(64bit) \
libQt63DQuickAnimation.so.6(Qt_6)(64bit) \
libQt63DQuickAnimation.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickExtras.so.6()(64bit) \
libQt63DQuickExtras.so.6(Qt_6)(64bit) \
libQt63DQuickExtras.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickInput.so.6()(64bit) \
libQt63DQuickInput.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickRender.so.6()(64bit) \
libQt63DQuickRender.so.6(Qt_6)(64bit) \
libQt63DQuickRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickScene2D.so.6()(64bit) \
libQt63DQuickScene2D.so.6(Qt_6)(64bit) \
libQt63DQuickScene2D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DRender.so.6()(64bit) \
libQt63DRender.so.6(Qt_6)(64bit) \
libQt63DRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick6 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
