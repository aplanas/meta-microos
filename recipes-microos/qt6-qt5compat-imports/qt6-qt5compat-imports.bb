SUMMARY = "Qt 6 Core 5 Compat QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Core5Compat module. \
This package shall be used while porting away from qtgraphicaleffects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qt5compat-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "bb62329fb73467ed8202196ddcea0a1442c0e8c0735bc9e8985d140bdf6dd6add833bf37e8056f6bf5e529b4662ee523cdd4f6a14f2810c5e096a965eaef3c86"

RPROVIDES:${PN} += "libqtgraphicaleffectsplugin.so()(64bit) libqtgraphicaleffectsplugin.so(Qt_6)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.0)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.1)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.2)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.3)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.4)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.5)(64bit) libqtgraphicaleffectsplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtgraphicaleffectsprivateplugin.so()(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.0)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.1)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.2)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.3)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.4)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.5)(64bit) libqtgraphicaleffectsprivateplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-qt5compat-imports qt6-qt5compat-imports(aarch-64) qt6qmlimport(Qt5Compat.GraphicalEffects.1) qt6qmlimport(Qt5Compat.GraphicalEffects.6) qt6qmlimport(Qt5Compat.GraphicalEffects.private.1) qt6qmlimport(Qt5Compat.GraphicalEffects.private.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
