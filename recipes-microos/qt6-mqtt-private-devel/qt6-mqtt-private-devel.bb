SUMMARY = "Non-ABI stable API for the Qt 6 Mqtt library"
DESCRIPTION = "This package provides private headers of libQt6Mqtt that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-mqtt-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e8c5149174237c0a6f81cef4485d3ee651f8637620c92b0295e9ccdbdea5fc5865ce20311fd978895ac4399be219224618fb9000e90a8dc2638b6947747a809f"

RPROVIDES:${PN} += "qt6-mqtt-private-devel qt6-mqtt-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Mqtt)"

inherit rpm
