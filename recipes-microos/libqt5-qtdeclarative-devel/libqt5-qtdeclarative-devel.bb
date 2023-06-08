SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package, if you want to compile programs with qtdeclarative."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde23"

RPM_NAME = "libqt5-qtdeclarative-devel-5.15.9+kde23-1.1.aarch64.rpm"
RPM_HASH = "a4c832e50c2157d6602f6575d4fbecab26c5446cc2cc12488f2e33ba88ee838eea58740e89ebe0ab5ef992e2f0f7a5cfaca95d63db479592a35445f095c5eaf3"

RPROVIDES:${PN} += "cmake(Qt5PacketProtocol) cmake(Qt5Qml) cmake(Qt5QmlDebug) cmake(Qt5QmlDevTools) cmake(Qt5QmlImportScanner) cmake(Qt5QmlModels) cmake(Qt5QmlWorkerScript) cmake(Qt5Quick) cmake(Qt5QuickCompiler) cmake(Qt5QuickParticles) cmake(Qt5QuickShapes) cmake(Qt5QuickTest) cmake(Qt5QuickWidgets) libQt5Quick-devel libqmltestplugin.so()(64bit) libqt5-qtdeclarative-devel libqt5-qtdeclarative-devel(aarch-64) pkgconfig(Qt5Qml) pkgconfig(Qt5QmlModels) pkgconfig(Qt5QmlWorkerScript) pkgconfig(Qt5Quick) pkgconfig(Qt5QuickTest) pkgconfig(Qt5QuickWidgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickTest.so.5()(64bit) libQt5QuickTest.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Test.so.5()(64bit) libQt5Test.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQtQuick5 libc.so.6(GLIBC_2.17)(64bit) libqt5-qtdeclarative-tools libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Network) pkgconfig(Qt5Qml) pkgconfig(Qt5QmlModels) pkgconfig(Qt5Quick) pkgconfig(Qt5Test) pkgconfig(Qt5Widgets)"

inherit rpm
