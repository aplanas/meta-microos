SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6DesignerComponents6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a03545ae22b391e9eca56e76c6e9fd6597e8ea09626c08521a44e2cca4cdd2b9b6e74badab79b2df9411f5d27c6c21df0fb4fc3f79ab4a32ecc5f0e91d75c359"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6()(64bit) libQt6DesignerComponents.so.6(Qt_6)(64bit) libQt6DesignerComponents.so.6(Qt_6.0)(64bit) libQt6DesignerComponents.so.6(Qt_6.1)(64bit) libQt6DesignerComponents.so.6(Qt_6.2)(64bit) libQt6DesignerComponents.so.6(Qt_6.3)(64bit) libQt6DesignerComponents.so.6(Qt_6.4)(64bit) libQt6DesignerComponents.so.6(Qt_6.5)(64bit) libQt6DesignerComponents.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6DesignerComponents6 libQt6DesignerComponents6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Designer.so.6()(64bit) libQt6Designer.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
