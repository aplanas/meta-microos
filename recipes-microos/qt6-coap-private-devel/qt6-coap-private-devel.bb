SUMMARY = "Non-ABI stable API for the Qt 6 CoAP library"
DESCRIPTION = "This package provides private headers of libQt6Coap that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-coap-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0376b607074ff51f5997b53d35d49e025e5ecea8e8b57b86718a69ce6af630eb3d942e5a010956cec6d7d81853c2cebb984f48298801b605d8d492d629347f8a"

RPROVIDES:${PN} += "qt6-coap-private-devel qt6-coap-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Coap)"

inherit rpm
