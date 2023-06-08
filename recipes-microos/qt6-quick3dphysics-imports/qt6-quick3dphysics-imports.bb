SUMMARY = "Qt 6 Quick3DPhysics QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3DPhysics module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysics-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f5095a612ee2290acdbbbd06588bfc01e0cf448c594e251b55f29b78f217a315dd518fd243c29196acc31608da7f1266c492937a298918c58521518ec255924d"

RPROVIDES:${PN} += "libqquick3dphysicsplugin.so()(64bit) libqquick3dphysicsplugin.so(Qt_6)(64bit) libqquick3dphysicsplugin.so(Qt_6.0)(64bit) libqquick3dphysicsplugin.so(Qt_6.1)(64bit) libqquick3dphysicsplugin.so(Qt_6.2)(64bit) libqquick3dphysicsplugin.so(Qt_6.3)(64bit) libqquick3dphysicsplugin.so(Qt_6.4)(64bit) libqquick3dphysicsplugin.so(Qt_6.5)(64bit) libqquick3dphysicsplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtquick3dphysicshelpersplugin.so()(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.0)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.1)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.2)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.3)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.4)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.5)(64bit) libqtquick3dphysicshelpersplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-quick3dphysics-imports qt6-quick3dphysics-imports(aarch-64) qt6qmlimport(QtQuick3D.Physics.6)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3DPhysics.so.6()(64bit) libQt6Quick3DPhysics.so.6(Qt_6)(64bit) libQt6Quick3DPhysicsHelpers.so.6()(64bit) libQt6Quick3DPhysicsHelpers.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
