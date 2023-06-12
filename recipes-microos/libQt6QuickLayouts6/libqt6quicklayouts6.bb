SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickLayouts6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "701f1727fd9e2681d7e7052e3dc2000b1db8b678fbf54b529bb8b717082d0eaba191b16a2ca82de3844f5e6667b77ec4105956cbd64708adaaa1d30336a6dba2"

RPROVIDES:${PN} += "libQt6QuickLayouts.so.6()(64bit) libQt6QuickLayouts.so.6(Qt_6)(64bit) libQt6QuickLayouts.so.6(Qt_6.0)(64bit) libQt6QuickLayouts.so.6(Qt_6.1)(64bit) libQt6QuickLayouts.so.6(Qt_6.2)(64bit) libQt6QuickLayouts.so.6(Qt_6.3)(64bit) libQt6QuickLayouts.so.6(Qt_6.4)(64bit) libQt6QuickLayouts.so.6(Qt_6.5)(64bit) libQt6QuickLayouts.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6QuickLayouts6 libQt6QuickLayouts6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
