SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "krunner-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "be7d39f7ffeee549aed83afd80e2933227e8c97f18abb595c6f5ecddf673319b7d97f379ae10011dbabaef1e79cfca50079b87d15cb118d18c0cf10ea8ddc530"

RPROVIDES:${PN} += "cmake(KF5Runner) krunner-devel krunner-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Plasma) cmake(Qt5Core) extra-cmake-modules libKF5Runner5"

inherit rpm
