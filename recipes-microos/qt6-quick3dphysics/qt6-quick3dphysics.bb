SUMMARY = "Qt 6 Quick3D Physics Extensions"
DESCRIPTION = "This module adds physical simulation capabilities on top of Qt Quick 3D. \
In particular, it enables rigid body simulation using simple primitives as well \
as convex- and triangle meshes and heightmaps. Physical properties such as mass, \
density, gravity and friction are customizable. This makes it possible to create \
physically correct behavior in 3D scenes without having to handcraft animations."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2360175ee905785193a300b61092180119e72392330c4339a425c43f4cf87aedd9cc174a6f71c3f80f7ecac6cb023694d083287b542cc451dada6aa216650015"

RPROVIDES:${PN} += "qt6-quick3dphysics qt6-quick3dphysics(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
