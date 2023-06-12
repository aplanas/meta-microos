SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6DesignerComponents6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0aa7f0914b64eefed878913dc7cb7f82abf1bd13f2c75c0f789f825f693f7e24258d134e18f8f6b03cf66ee43909662eacfbf45dd9a0aeeab14730ae18bd8518"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6()(64bit) libQt6DesignerComponents.so.6(Qt_6)(64bit) libQt6DesignerComponents.so.6(Qt_6.0)(64bit) libQt6DesignerComponents.so.6(Qt_6.1)(64bit) libQt6DesignerComponents.so.6(Qt_6.2)(64bit) libQt6DesignerComponents.so.6(Qt_6.3)(64bit) libQt6DesignerComponents.so.6(Qt_6.4)(64bit) libQt6DesignerComponents.so.6(Qt_6.5)(64bit) libQt6DesignerComponents.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6DesignerComponents6 libQt6DesignerComponents6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Designer.so.6()(64bit) libQt6Designer.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
