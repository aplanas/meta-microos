SUMMARY = "Non-ABI stable API for the Qt 6 OpcUa library"
DESCRIPTION = "This package provides private headers of libQt6Opcua that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "642fcfff1a250ec7d06b0fdf41b0dafb8df712d1a78e75a823448fb4b5f564e7bcbc2701df975fc78641dfc3c1401f18a8efd91f495064eba936de5902a881a1"

RPROVIDES:${PN} += "qt6-opcua-private-devel qt6-opcua-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6OpcUa)"

inherit rpm
