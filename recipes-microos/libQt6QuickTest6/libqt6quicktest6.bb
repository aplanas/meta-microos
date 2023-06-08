SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickTest6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "fb3ce09f3264ade2472206f69ea8dafe0d6a9a228f4780e15bc7cb3e1d3347120d5b7283503b982987eeb5aa9a5f66b76aba1ff3a166b6c5295ed560459f1da3"

RPROVIDES:${PN} += "libQt6QuickTest.so.6()(64bit) libQt6QuickTest.so.6(Qt_6)(64bit) libQt6QuickTest.so.6(Qt_6.0)(64bit) libQt6QuickTest.so.6(Qt_6.1)(64bit) libQt6QuickTest.so.6(Qt_6.2)(64bit) libQt6QuickTest.so.6(Qt_6.3)(64bit) libQt6QuickTest.so.6(Qt_6.4)(64bit) libQt6QuickTest.so.6(Qt_6.5)(64bit) libQt6QuickTest.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTest6 libQt6QuickTest6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Test.so.6()(64bit) libQt6Test.so.6(Qt_6)(64bit) libQt6Test.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
