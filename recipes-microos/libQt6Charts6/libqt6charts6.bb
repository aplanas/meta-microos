SUMMARY = "Qt 6 Charts library"
DESCRIPTION = "The Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Charts6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ce1d24292e32e14b47d0adf3032ce4964908bedfc807eb1cb1867ebeced54c6481ec9e057d62555b21ac86b6f62c173186df6aca1d39155fe93b032c4e120c98"

RPROVIDES:${PN} += "libQt6Charts.so.6()(64bit) libQt6Charts.so.6(Qt_6)(64bit) libQt6Charts.so.6(Qt_6.0)(64bit) libQt6Charts.so.6(Qt_6.1)(64bit) libQt6Charts.so.6(Qt_6.2)(64bit) libQt6Charts.so.6(Qt_6.3)(64bit) libQt6Charts.so.6(Qt_6.4)(64bit) libQt6Charts.so.6(Qt_6.5)(64bit) libQt6Charts.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Charts6 libQt6Charts6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6OpenGLWidgets.so.6()(64bit) libQt6OpenGLWidgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
