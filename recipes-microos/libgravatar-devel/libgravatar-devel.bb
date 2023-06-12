SUMMARY = "Development package for libgravatar"
DESCRIPTION = "The development package for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libgravatar-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "297635db5716d5c23416db5f94114c9d7c386b36a78da1b69026eb39a1d6e716e8d81fdb0c7059ab0cbfe1f88b75626449f4ad83a0598eeb21600979d2f76d04"

RPROVIDES:${PN} += "cmake(KF5Gravatar) cmake(KPim5Gravatar) libgravatar-devel libgravatar-devel(aarch-64)"
RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
