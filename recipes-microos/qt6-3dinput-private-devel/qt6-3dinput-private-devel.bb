SUMMARY = "Non-ABI stable API for the Qt 6 3DInput library"
DESCRIPTION = "This package provides private headers of libQt63DInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dinput-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2740b5f17c84b5c9303c8bf7b820fb94647279e4c5852975398ebf534e99b69becdbed489f2602f4b9f459ac0c627324e3c78cd19c1f94dcb3748bf7ccbdbc4b"

RPROVIDES:${PN} += "qt6-3dinput-private-devel qt6-3dinput-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DInput)"

inherit rpm
