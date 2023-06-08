SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DQuickAnimation that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickanimation-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "336c64678a67175ff52c40ca0b96b457157e054e4b0cdfbcefb857c967ec202101a537038fa30e1f1caff59b73dae4ead2d16ae1b2e9ef702549518b3fc84163"

RPROVIDES:${PN} += "qt6-3dquickanimation-private-devel qt6-3dquickanimation-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickAnimation)"

inherit rpm
