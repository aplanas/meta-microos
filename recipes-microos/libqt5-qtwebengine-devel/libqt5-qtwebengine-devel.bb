SUMMARY = "Development files for the Qt5 WebEngine library"
DESCRIPTION = "You need this package if you want to compile programs with Qt WebEngine."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtwebengine-devel-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "8e0769be4bc61ef4ed574d23612fa98433292997452c38f66ce53586fcfd7db54edf7180479ae6391ef05552bb37c8ea118a998368efed855606a0cc329a8f46"

RPROVIDES:${PN} += "cmake(Qt5WebEngine) \
cmake(Qt5WebEngineCore) \
cmake(Qt5WebEngineWidgets) \
libqt5-qtwebengine-devel \
libqt5-qtwebengine-devel(aarch-64) \
libqwebengineview.so()(64bit) \
pkgconfig(Qt5WebEngine) \
pkgconfig(Qt5WebEngineCore) \
pkgconfig(Qt5WebEngineWidgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5-qtwebengine \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Network) \
pkgconfig(Qt5Positioning) \
pkgconfig(Qt5PrintSupport) \
pkgconfig(Qt5Qml) \
pkgconfig(Qt5Quick) \
pkgconfig(Qt5WebChannel) \
pkgconfig(Qt5WebEngineCore) \
pkgconfig(Qt5Widgets)"

inherit rpm
