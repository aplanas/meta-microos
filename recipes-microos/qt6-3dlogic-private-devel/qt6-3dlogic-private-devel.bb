SUMMARY = "Non-ABI stable API for the Qt 6 3DLogic library"
DESCRIPTION = "This package provides private headers of libQt63DLogic that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dlogic-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f4506a19fe9b42dc49156a30d94d764781e3b81c7a539fea64673ce059562dc9af782797820f1f905d42f120f4d4ffec727b0fbdc59d21adb8d27474682ea6ae"

RPROVIDES:${PN} += "qt6-3dlogic-private-devel qt6-3dlogic-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DLogic)"

inherit rpm
