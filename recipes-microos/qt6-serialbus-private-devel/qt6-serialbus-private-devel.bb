SUMMARY = "Non-ABI stable API for the Qt 6 SerialBus library"
DESCRIPTION = "This package provides private headers of libQt6SerialBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f4f909fba89d19db18cf6432478579a10c80a49f6500a0f9f34a0bd193aa8ba8f30b0b70b9fb5a4f726d95f6e81b71cbd2a32bfa18b5976ea6a791414220d7a1"

RPROVIDES:${PN} += "qt6-serialbus-private-devel \
qt6-serialbus-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SerialBus) \
qt6-core-private-devel"

inherit rpm
