SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webengine-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9dba8640d3a910e1f5aa838ef9ccc9ba0f9246b9ab05562a6b9d42d0e8f7e0be583567c8bfc83a82477791fb2441231719e2657413cdda47439eb326e822f26d"

RPROVIDES:${PN} += "libqtwebenginequickdelegatesplugin.so()(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.0)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.1)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.2)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.3)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.4)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.5)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) libqtwebenginequickplugin.so()(64bit) libqtwebenginequickplugin.so(Qt_6)(64bit) libqtwebenginequickplugin.so(Qt_6.0)(64bit) libqtwebenginequickplugin.so(Qt_6.1)(64bit) libqtwebenginequickplugin.so(Qt_6.2)(64bit) libqtwebenginequickplugin.so(Qt_6.3)(64bit) libqtwebenginequickplugin.so(Qt_6.4)(64bit) libqtwebenginequickplugin.so(Qt_6.5)(64bit) libqtwebenginequickplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-webengine-imports qt6-webengine-imports(aarch-64) qt6qmlimport(QtWebEngine.1) qt6qmlimport(QtWebEngine.2) qt6qmlimport(QtWebEngine.6) qt6qmlimport(QtWebEngine.ControlsDelegates.1) qt6qmlimport(QtWebEngine.ControlsDelegates.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6()(64bit) libQt6WebEngineQuick.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6WebEngineQuickDelegatesQml.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
