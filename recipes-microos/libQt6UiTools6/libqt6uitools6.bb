SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6UiTools6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "569c749602d9526fdcc0627b39d1198910f1924fd588b903e13af04c5e1e41b09b64f5896e266f694beadf3f1e0ed57c01b688277238bf1229bb0b065cb99b1b"

RPROVIDES:${PN} += "libQt6UiTools.so.6()(64bit) libQt6UiTools.so.6(Qt_6)(64bit) libQt6UiTools.so.6(Qt_6.0)(64bit) libQt6UiTools.so.6(Qt_6.1)(64bit) libQt6UiTools.so.6(Qt_6.2)(64bit) libQt6UiTools.so.6(Qt_6.3)(64bit) libQt6UiTools.so.6(Qt_6.4)(64bit) libQt6UiTools.so.6(Qt_6.5)(64bit) libQt6UiTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6UiTools6 libQt6UiTools6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGLWidgets.so.6()(64bit) libQt6OpenGLWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
