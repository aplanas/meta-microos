SUMMARY = "Krita Build Environment"
DESCRIPTION = "Development headers and libraries for Krita."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-devel-5.1.5-1.6.aarch64.rpm"
RPM_HASH = "990e07a665f66fa0f50e07c7cc9c03237d76f94d6dcce7c0699d54aa491cc53cbf1f5224c5678a4e5baa637fc0c4c3a09ce327b6ebaaae87eed4ca7ae7654183"

RPROVIDES:${PN} += "krita-devel \
krita-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
krita"

inherit rpm
