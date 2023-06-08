SUMMARY = "Examples for the qt6-remoteobjects modules"
DESCRIPTION = "Examples for the qt6-remoteobjects modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d27cb487eec316a4fa992ba543e8573fa10c4cea6710d8b4f3962c01e255f0964f579d2897dcff482d4dc5c2371a1ee8afb1634fac2124d6b83b734710f9bec8"

RPROVIDES:${PN} += "libqmlqrotimeexampleplugin.so()(64bit) qt6-remoteobjects-examples qt6-remoteobjects-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Bluetooth.so.6()(64bit) libQt6Bluetooth.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6RemoteObjects.so.6()(64bit) libQt6RemoteObjects.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
