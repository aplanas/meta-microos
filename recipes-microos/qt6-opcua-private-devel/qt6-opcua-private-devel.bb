SUMMARY = "Non-ABI stable API for the Qt 6 OpcUa library"
DESCRIPTION = "This package provides private headers of libQt6Opcua that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "671a9ea9a9d3eefed84b67ae483799a5322ce6c50ac572f95c82d7ccf91c27c0ad163c7034154c821a947ee7f6ec2705ba705117852f14b617eb9585508e44b9"

RPROVIDES:${PN} += "qt6-opcua-private-devel qt6-opcua-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6OpcUa)"

inherit rpm
