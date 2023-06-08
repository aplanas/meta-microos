SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WlShellIntegration6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "52030c32bc7774cccd0bbb05ca90c3ea20e334f50bf547460864c4e513db3f2ec1d2c80cba2dfd98164467c708642487b419f0abf2d4c24d02c5b3e5b3b8cedc"

RPROVIDES:${PN} += "libQt6WlShellIntegration.so.6()(64bit) libQt6WlShellIntegration.so.6(Qt_6)(64bit) libQt6WlShellIntegration.so.6(Qt_6.0)(64bit) libQt6WlShellIntegration.so.6(Qt_6.1)(64bit) libQt6WlShellIntegration.so.6(Qt_6.2)(64bit) libQt6WlShellIntegration.so.6(Qt_6.3)(64bit) libQt6WlShellIntegration.so.6(Qt_6.4)(64bit) libQt6WlShellIntegration.so.6(Qt_6.5)(64bit) libQt6WlShellIntegration.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WlShellIntegration6 libQt6WlShellIntegration6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WaylandClient.so.6()(64bit) libQt6WaylandClient.so.6(Qt_6)(64bit) libQt6WaylandClient.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
