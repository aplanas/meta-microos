SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdeclarative-tools-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "63a19ba959ae521453f95999d7aa108c83fcb3d397924479aedd4c7adbdf58317f2bf3fe4d23b602df3f6b5326b338363d7161d55ac96de6fb8323593a0b9580"

RPROVIDES:${PN} += "kdeclarative-tools kdeclarative-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Declarative.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Package.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
