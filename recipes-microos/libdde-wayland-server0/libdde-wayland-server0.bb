SUMMARY = "Deepin Wayland Server"
DESCRIPTION = "DDE wayland server library with DDE custom protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdde-wayland-server0-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "5243dc964a6f815e90308c0e3580816103f4526dc0fe5feae48498f83647d0b28934781a7502dfca129a03c517c441ccb5dd7d57027166ca3d52a5e7081effa9"

RPROVIDES:${PN} += "libdde-wayland-server.so.0()(64bit) libdde-wayland-server0 libdde-wayland-server0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5WaylandCompositor.so.5()(64bit) libQt5WaylandCompositor.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
