SUMMARY = "Qt 6 3DQuickScene2D library"
DESCRIPTION = "The Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuickScene2D6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b8ab970d09657af45a12be45de01e7e9c9d4183a23c0cb24135a6580f6c912740e04f42aa02141c6e8fb0f43487f3e9e5ab0a784553c2b36b5b1ab3d75f3853a"

RPROVIDES:${PN} += "libQt63DQuickScene2D.so.6()(64bit) libQt63DQuickScene2D.so.6(Qt_6)(64bit) libQt63DQuickScene2D.so.6(Qt_6.0)(64bit) libQt63DQuickScene2D.so.6(Qt_6.1)(64bit) libQt63DQuickScene2D.so.6(Qt_6.2)(64bit) libQt63DQuickScene2D.so.6(Qt_6.3)(64bit) libQt63DQuickScene2D.so.6(Qt_6.4)(64bit) libQt63DQuickScene2D.so.6(Qt_6.5)(64bit) libQt63DQuickScene2D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuickScene2D6 libQt63DQuickScene2D6(aarch-64) libscene2d.so()(64bit) libscene2d.so(Qt_6)(64bit) libscene2d.so(Qt_6.0)(64bit) libscene2d.so(Qt_6.1)(64bit) libscene2d.so(Qt_6.2)(64bit) libscene2d.so(Qt_6.3)(64bit) libscene2d.so(Qt_6.4)(64bit) libscene2d.so(Qt_6.5)(64bit) libscene2d.so(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
