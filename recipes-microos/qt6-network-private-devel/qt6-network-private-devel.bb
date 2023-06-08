SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-network-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "c18bda6a3f1a304e67685932e8b3df385f8309a00e4435f81b558c7f20dc75ed66184795613620e6af4b2704a29f2e06579e332b57fa24d355fd9f7a2b6da21c"

RPROVIDES:${PN} += "qt6-network-private-devel qt6-network-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Network) libopenssl-3-devel qt6-core-private-devel"

inherit rpm
