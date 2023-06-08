SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-wayland-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0bb250bbd895ce594a262c1adb2229a44558a4f32f8219cd53b03a2990be69e5d29dc060389da8f120466e2d5bfb7c193c84747ecd9fd5e1a4909f34eb0afefe"

RPROVIDES:${PN} += "qt6-wayland-devel qt6-wayland-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WaylandClient) cmake(Qt6WaylandCompositor) cmake(Qt6WaylandGlobalPrivate)"

inherit rpm
