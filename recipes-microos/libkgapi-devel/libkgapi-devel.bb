SUMMARY = "Build environment for libkgapi"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkgapi-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7d5e7aff3510c53d5d7962a41b49c39ecda11b0ecbe77f7b79c71c91fae7ad78843b1641fafc9d10b01a1b72a570e92236afd58b78c0b8f1cc9b8e947922a14f"

RPROVIDES:${PN} += "cmake(KPim5GAPI) cmake(KPimGAPI) libkgapi-devel libkgapi-devel(aarch-64) libkgapi5-devel"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5Contacts) libKPim5GAPIBlogger5 libKPim5GAPICalendar5 libKPim5GAPICore5 libKPim5GAPIDrive5 libKPim5GAPILatitude5 libKPim5GAPIMaps5 libKPim5GAPIPeople5 libKPim5GAPITasks5"

inherit rpm
