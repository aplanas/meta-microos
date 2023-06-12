SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8a962c8204cf10a23d8dd6b78b797f4526ae31d87f0fe1848b44d2c4b3ffa187fa0e97063552b311b8ad5226d71efcd6dd21799e75fabca26617e456a6e137e3"

RPROVIDES:${PN} += "qt6-scxml-private-devel qt6-scxml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Scxml) qt6-qml-private-devel"

inherit rpm
