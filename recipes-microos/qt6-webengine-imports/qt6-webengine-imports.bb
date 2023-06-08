SUMMARY = "Qt 6 WebEngine QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebEngine module"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webengine-imports-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "18c4da90afa8d7ffe7dd7e837f0ec9dba1776c7be0b60dc4bae97b8f7af4aa0e451845fa3423705a19dd588adcf2f5ce31d627dba6deb82b03b184fb04cb2022"

RPROVIDES:${PN} += "libqtwebenginequickdelegatesplugin.so()(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.0)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.1)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.2)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.3)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.4)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.5)(64bit) libqtwebenginequickdelegatesplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtwebenginequickplugin.so()(64bit) libqtwebenginequickplugin.so(Qt_6)(64bit) libqtwebenginequickplugin.so(Qt_6.0)(64bit) libqtwebenginequickplugin.so(Qt_6.1)(64bit) libqtwebenginequickplugin.so(Qt_6.2)(64bit) libqtwebenginequickplugin.so(Qt_6.3)(64bit) libqtwebenginequickplugin.so(Qt_6.4)(64bit) libqtwebenginequickplugin.so(Qt_6.5)(64bit) libqtwebenginequickplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-webengine-imports qt6-webengine-imports(aarch-64) qt6qmlimport(QtWebEngine.1) qt6qmlimport(QtWebEngine.2) qt6qmlimport(QtWebEngine.6) qt6qmlimport(QtWebEngine.ControlsDelegates.1) qt6qmlimport(QtWebEngine.ControlsDelegates.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6()(64bit) libQt6WebEngineQuick.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebEngineQuickDelegatesQml.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
