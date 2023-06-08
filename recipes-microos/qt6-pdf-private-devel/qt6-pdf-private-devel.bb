SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdf-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "4f7ce7abc1068dafa94a54f4e9e792edd1a331e62700c0f161f4bc1eff07c69eb77561ec3e2eafa0d3bde046dda1d09201b9eb301323abef080725fc96f6f75f"

RPROVIDES:${PN} += "qt6-pdf-private-devel qt6-pdf-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Pdf)"

inherit rpm
