SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6Help6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "667974891136982dc1b1d836496a433ff36d427f2d8610ad84a7d517509b213be3259116d74057293f788524dcbaf1257ef79b01092dd17afd3c72f1a3ad912e"

RPROVIDES:${PN} += "libQt6Help.so.6()(64bit) libQt6Help.so.6(Qt_6)(64bit) libQt6Help.so.6(Qt_6.0)(64bit) libQt6Help.so.6(Qt_6.1)(64bit) libQt6Help.so.6(Qt_6.2)(64bit) libQt6Help.so.6(Qt_6.3)(64bit) libQt6Help.so.6(Qt_6.4)(64bit) libQt6Help.so.6(Qt_6.5)(64bit) libQt6Help.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Help6 libQt6Help6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
