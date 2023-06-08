SUMMARY = "Qt 6 3DExtras library"
DESCRIPTION = "The Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DExtras6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "dbe8c05dc4a4663d87d93eab1fcdc6cc5858f3b54b21f365988a2ed27a7022618aff6a988fb36ebadb7ffff3c930df2fa0529111b97dc541f432bf9b0a6bd9fd"

RPROVIDES:${PN} += "libQt63DExtras.so.6()(64bit) libQt63DExtras.so.6(Qt_6)(64bit) libQt63DExtras.so.6(Qt_6.0)(64bit) libQt63DExtras.so.6(Qt_6.1)(64bit) libQt63DExtras.so.6(Qt_6.2)(64bit) libQt63DExtras.so.6(Qt_6.3)(64bit) libQt63DExtras.so.6(Qt_6.4)(64bit) libQt63DExtras.so.6(Qt_6.5)(64bit) libQt63DExtras.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DExtras6 libQt63DExtras6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
