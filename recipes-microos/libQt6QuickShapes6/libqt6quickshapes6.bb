SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickShapes6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "1141fd2c076a453f07048a43b0796f6f7aa157c42de67e7f0263e14694401cc220c9a932b207b6b782d3964c7de93c24b7811ca0c7f744ae4333f2448cc92a16"

RPROVIDES:${PN} += "libQt6QuickShapes.so.6()(64bit) libQt6QuickShapes.so.6(Qt_6)(64bit) libQt6QuickShapes.so.6(Qt_6.0)(64bit) libQt6QuickShapes.so.6(Qt_6.1)(64bit) libQt6QuickShapes.so.6(Qt_6.2)(64bit) libQt6QuickShapes.so.6(Qt_6.3)(64bit) libQt6QuickShapes.so.6(Qt_6.4)(64bit) libQt6QuickShapes.so.6(Qt_6.5)(64bit) libQt6QuickShapes.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickShapes6 libQt6QuickShapes6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
