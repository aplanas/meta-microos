SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "0d189bbe0e42d57356d708c65693ffbb5c04b85923c5d1bf4d111a8b8fbd717ef3ca1bc1f57ed3833d8738b60a96ab3e8be770ada99f0f3b265a0bfa6392c691"

RPROVIDES:${PN} += "libQt6QuickDialogs2QuickImpl.so.6()(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.0)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.1)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.2)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.3)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.4)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.5)(64bit) libQt6QuickDialogs2QuickImpl.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickDialogs2QuickImpl6 libQt6QuickDialogs2QuickImpl6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickControls2Impl.so.6()(64bit) libQt6QuickControls2Impl.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickDialogs2Utils.so.6()(64bit) libQt6QuickDialogs2Utils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTemplates2.so.6()(64bit) libQt6QuickTemplates2.so.6(Qt_6)(64bit) libQt6QuickTemplates2.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
