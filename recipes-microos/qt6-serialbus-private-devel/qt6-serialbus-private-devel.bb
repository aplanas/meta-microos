SUMMARY = "Non-ABI stable API for the Qt 6 SerialBus library"
DESCRIPTION = "This package provides private headers of libQt6SerialBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fc0433df74197f87a8518b8bcdd046f969ad3bea00ee577c8ced73b73fe47f38dd1e77a270eaf7dc44b683664d3ed5f57ec14378e093f80f465c58d451f98ee0"

RPROVIDES:${PN} += "qt6-serialbus-private-devel qt6-serialbus-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SerialBus) qt6-core-private-devel"

inherit rpm
