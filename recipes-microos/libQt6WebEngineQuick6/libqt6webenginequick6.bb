SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "addc6024d88d650928f1984252d2be65a9758455e32ccf3358450e63cd7ca8b735efb6b974b693a5902c3d3bf540df3d82d26411abe62d1669adc323824a3f0e"

RPROVIDES:${PN} += "libQt6WebEngineQuick.so.6()(64bit) \
libQt6WebEngineQuick.so.6(Qt_6)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.0)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.1)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.2)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.3)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.4)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.5)(64bit) \
libQt6WebEngineQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WebEngineQuick6 \
libQt6WebEngineQuick6(aarch-64) \
libQt6WebEngineQuickDelegatesQml.so.6()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6WebChannel.so.6()(64bit) \
libQt6WebChannel.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt6-webengine-imports"

inherit rpm
