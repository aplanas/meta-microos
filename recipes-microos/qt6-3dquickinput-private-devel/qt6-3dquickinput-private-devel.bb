SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickInput library"
DESCRIPTION = "This package provides private headers of libQt63DQuickInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickinput-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4703cf9ea0aa10f647ea422bda64cff12f731f1f2b23238a767fff6a73480e2efe2277ae1f018293e8719e62d049102d7d13a7a6bf688c5e75f2dc960b5c9216"

RPROVIDES:${PN} += "qt6-3dquickinput-private-devel qt6-3dquickinput-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickInput)"

inherit rpm
