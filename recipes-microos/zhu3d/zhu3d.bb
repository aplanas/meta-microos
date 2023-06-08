SUMMARY = "OpenGL-based equation viewer and solver"
DESCRIPTION = "With Zhu3D you can view, animate and solve up to three functions in \
3D-space in a interactive manner. In addition, you further can observe \
an independent parametric system. The OpenGL-viewer supports zooming, \
scaling, rotating, translating as well as filed lightning, \
transparency or surface-properties. \
 \
You have up to 8 independent lights or spotlights, background \
settings, miscellaneous wire-modes or global illumination \
models. Pictures are rendered as png or jpg and can have an arbitrary \
size. Numerical solutions of an equation-system are found with a quite \
fast and reliable adaptive random search."
LICENSE = "GPL-3.0"

PV = "4.2.6"

RPM_NAME = "zhu3d-4.2.6-5.9.aarch64.rpm"
RPM_HASH = "bbd246a582b36afc4bbe6f02a969996b93185b71b7c8db30535f362ea8ec14ea48795370cba2b6f3a014f2ddb79371c0c378bdecd692470752c172aaf9ef2c23"

RPROVIDES:${PN} += "application() application(zhu3d.desktop) zhu3d zhu3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libQtCore.so.4()(64bit) libQtGui.so.4()(64bit) libQtOpenGL.so.4()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
