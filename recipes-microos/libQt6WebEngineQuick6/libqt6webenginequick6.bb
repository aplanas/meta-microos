SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6WebEngineQuick6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "dfd46407570e7e88774b0e6cc07339b129ee6eecd063a423c9b29b42de5c1b9d76864f8f0e1d2d6e785e803ecdb5c48d7342b95e4528c10d20af0d939259f649"

RPROVIDES:${PN} += "libQt6WebEngineQuick.so.6()(64bit) libQt6WebEngineQuick.so.6(Qt_6)(64bit) libQt6WebEngineQuick.so.6(Qt_6.0)(64bit) libQt6WebEngineQuick.so.6(Qt_6.1)(64bit) libQt6WebEngineQuick.so.6(Qt_6.2)(64bit) libQt6WebEngineQuick.so.6(Qt_6.3)(64bit) libQt6WebEngineQuick.so.6(Qt_6.4)(64bit) libQt6WebEngineQuick.so.6(Qt_6.5)(64bit) libQt6WebEngineQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebEngineQuick6 libQt6WebEngineQuick6(aarch-64) libQt6WebEngineQuickDelegatesQml.so.6()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6WebChannel.so.6()(64bit) libQt6WebChannel.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6()(64bit) libQt6WebEngineCore.so.6(Qt_6)(64bit) libQt6WebEngineCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt6-webengine-imports"

inherit rpm
