SUMMARY = "Non-ABI stable API for the Qt 6 3DExtras library"
DESCRIPTION = "This package provides private headers of libQt63DExtras that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dextras-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4255c91324bcd1880b35a37be0dc4c8f81f42c4847b3c768e7dde1c459d4c59525d5a42c4501a52bc51ec31a081be8ea5297eb93069b634b1e5087c9f7e2feb9"

RPROVIDES:${PN} += "qt6-3dextras-private-devel qt6-3dextras-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DExtras)"

inherit rpm
