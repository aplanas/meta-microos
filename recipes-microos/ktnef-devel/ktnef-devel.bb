SUMMARY = "Development files for libKPim5Tnef5"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktnef-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "17d5e207d476c146979d95e1db0833fb0138925ae35b913984e5c510a7927d00367e135da3212632ca42928816c24535525bfa345fcf31fb8b44fa5d49076716"

RPROVIDES:${PN} += "cmake(KF5Tnef) cmake(KPim5Tnef) ktnef-devel ktnef-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) libKPim5Tnef5"

inherit rpm
