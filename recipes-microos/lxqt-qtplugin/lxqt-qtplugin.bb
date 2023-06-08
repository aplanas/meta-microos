SUMMARY = "LXQt platform integration plugin for Qt 5"
DESCRIPTION = "With this plugin, all Qt-based programs can adopt settings of \
LXQt, such as the icon theme. \
 \
To use the plugin in Qt5, we have to export the environment \
variable QT_QPA_PLATFORMTHEME=lxqt. Then every Qt5 program \
can load the theme plugin. \
If, for some unknown reasons, the plugin is not loaded, we can \
debug the plugin by exporting QT_DEBUG_PLUGINS=1. \
Then, Qt5 will print detailed information and error messages \
about all plugins in the console when running any Qt5 programs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-qtplugin-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "cff97c94f7557cc46ad42487e3a5a4cee2e863bb08ea60afb4287793e5d3b28a9ed6a1e40375e5fcb40c5535df647a48db8e5f1fba32b099b1e2c9a373e28f55"

RPROVIDES:${PN} += "libqtlxqt.so()(64bit) lxqt-qtplugin lxqt-qtplugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5XdgIconLoader.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbusmenu-qt5.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
