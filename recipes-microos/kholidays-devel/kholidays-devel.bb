SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kholidays-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "958a0dd310d5e633f9b6a3295d95e3433938a3dbbf8941d7a0af42a55c0997bfce9ba027fa4c26c796be7638b39d0f25ad657ff04512de0a6665dddaf4241f11"

RPROVIDES:${PN} += "cmake(KF5Holidays) kholidays-devel kholidays-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) libKF5Holidays5"

inherit rpm
