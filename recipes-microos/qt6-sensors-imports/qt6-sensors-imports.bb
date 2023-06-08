SUMMARY = "Qt 6 Sensors QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Sensors module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f76dc397f3a7c133344cf1b28135608a6144ed7bf6d6d7e7bb50213c9fdfb87236d2699a74ebbb39ace5df96e4ad90a6315d5c938abcc247e426bf0e4557fddd"

RPROVIDES:${PN} += "libsensorsquickplugin.so()(64bit) libsensorsquickplugin.so(Qt_6)(64bit) libsensorsquickplugin.so(Qt_6.0)(64bit) libsensorsquickplugin.so(Qt_6.1)(64bit) libsensorsquickplugin.so(Qt_6.2)(64bit) libsensorsquickplugin.so(Qt_6.3)(64bit) libsensorsquickplugin.so(Qt_6.4)(64bit) libsensorsquickplugin.so(Qt_6.5)(64bit) libsensorsquickplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-sensors-imports qt6-sensors-imports(aarch-64)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6SensorsQuick.so.6()(64bit) libQt6SensorsQuick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
