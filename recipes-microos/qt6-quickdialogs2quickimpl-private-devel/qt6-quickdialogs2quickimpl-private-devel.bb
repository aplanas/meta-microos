SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "a9b8bf97b2af02928b2419397c001f9d5862f0c621fd97f91ccb9e1800d9c59f745fa0bdda76916bfe9676f9829417a8bd48d44f2ed6b7a6ad9232f1e2bd9019"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel qt6-quickdialogs2quickimpl-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickDialogs2QuickImpl)"

inherit rpm
