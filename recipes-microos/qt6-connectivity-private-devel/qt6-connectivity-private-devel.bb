SUMMARY = "Non-ABI stable API for the Qt 6 connectivity libraries"
DESCRIPTION = "This package provides private headers of qt6-connectivity that are normally \
not used by application development and that do not have any ABI or \
API guarantees. \
The packages that build against these have to require the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "145609fa1792982998f9e9d63e093691d28f054ea934c755eb22ff6a62d4ee66b5ece4b9743e0b66b418dfea8d2dfa32895603fb87ec9f6b2ee24cf4fce2b83e"

RPROVIDES:${PN} += "qt6-connectivity-private-devel qt6-connectivity-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Bluetooth) cmake(Qt6Nfc) qt6-core-private-devel"

inherit rpm
