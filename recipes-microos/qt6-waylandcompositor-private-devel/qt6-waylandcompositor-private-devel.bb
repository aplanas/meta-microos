SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9ac3d2e9b5caeb640501b4e947dd9abc7c2e63f984fa3c97041238fc477f3e565937172b488b8441f786443656cfa046988c6d9b40fcfcbea14df07c75fb69cd"

RPROVIDES:${PN} += "qt6-waylandcompositor-private-devel qt6-waylandcompositor-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WaylandCompositor)"

inherit rpm
