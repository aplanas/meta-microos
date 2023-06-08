SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "ebdcb7304e0e2222f6de03c97d8c4cdbe644871c721d4b8a3569268cc7f67bb529ff66e71dc22660f29797eb4d46fd8803b3570655a81df13f8204e735e68b87"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 libQt6QuickDialogs2-6(aarch-64) libQt6QuickDialogs2.so.6()(64bit) libQt6QuickDialogs2.so.6(Qt_6)(64bit) libQt6QuickDialogs2.so.6(Qt_6.0)(64bit) libQt6QuickDialogs2.so.6(Qt_6.1)(64bit) libQt6QuickDialogs2.so.6(Qt_6.2)(64bit) libQt6QuickDialogs2.so.6(Qt_6.3)(64bit) libQt6QuickDialogs2.so.6(Qt_6.4)(64bit) libQt6QuickDialogs2.so.6(Qt_6.5)(64bit) libQt6QuickDialogs2.so.6(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6QuickDialogs2QuickImpl.so.6()(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickDialogs2Utils.so.6()(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
