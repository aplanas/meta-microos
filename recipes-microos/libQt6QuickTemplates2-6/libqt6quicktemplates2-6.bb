SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickTemplates2-6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "b7d89bead07cf09679ac493a67424a67bbb55613d135180299bfcb2a3e0c9c7f0def03e4ab697f77c3082b5787592171ccbd43d2d26adbe3cc26c48ef8e8b103"

RPROVIDES:${PN} += "libQt6QuickTemplates2-6 libQt6QuickTemplates2-6(aarch-64) libQt6QuickTemplates2.so.6()(64bit) libQt6QuickTemplates2.so.6(Qt_6)(64bit) libQt6QuickTemplates2.so.6(Qt_6.0)(64bit) libQt6QuickTemplates2.so.6(Qt_6.1)(64bit) libQt6QuickTemplates2.so.6(Qt_6.2)(64bit) libQt6QuickTemplates2.so.6(Qt_6.3)(64bit) libQt6QuickTemplates2.so.6(Qt_6.4)(64bit) libQt6QuickTemplates2.so.6(Qt_6.5)(64bit) libQt6QuickTemplates2.so.6(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.32)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
