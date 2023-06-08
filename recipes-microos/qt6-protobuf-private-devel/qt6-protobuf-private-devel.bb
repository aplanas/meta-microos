SUMMARY = "Non-ABI stable API for the Qt 6 Protobuf Library"
DESCRIPTION = "This package provides private headers of libQt6Protobuf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-protobuf-private-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "f71d3c80844282c5b4037e781a7f29806a13e363c8ecd77b06c1dc2428fe28e459929b51575023e31d8ae9a090a9631949fb55b091f98e39a9b9b3ff88162b8f"

RPROVIDES:${PN} += "qt6-protobuf-private-devel qt6-protobuf-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Protobuf)"

inherit rpm
