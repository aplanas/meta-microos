SUMMARY = "Non-ABI stable API for the Qt 6 3DInput library"
DESCRIPTION = "This package provides private headers of libQt63DInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dinput-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f043827d0b14d508a33a911f971208fc00d230b9b7e9120c0a88c00d06540fdd21166a80a91276e241850e912f1c0e300edcdb318d9f636ee543e8ac2f987ba9"

RPROVIDES:${PN} += "qt6-3dinput-private-devel qt6-3dinput-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DInput)"

inherit rpm
