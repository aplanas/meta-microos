SUMMARY = "Development files for kcalutils"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications wanting to use kcalutils."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kcalutils-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "86ea4592d1e2886af596b8fd175aa7dd0d66ec90bb0458fe4565dda9f5bc41cf4efee0c7c7867314b1375b1cd1740f2a09d54ab50033534b267bd3374df8e4c9"

RPROVIDES:${PN} += "cmake(KF5CalendarUtils) cmake(KPim5CalendarUtils) kcalutils-devel kcalutils-devel(aarch-64) kcalutils5-devel"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5CoreAddons) cmake(KF5KDELibs4Support) libKPim5CalendarUtils5"

inherit rpm
