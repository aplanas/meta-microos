SUMMARY = "Build environment for libkgapi"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkgapi-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "13174a7e60a4bfd1d4f1a3aea4c1d47207e50e5f15507f9b38f493e6b6a864fea86ae9455c1f4622f3280db6ae9741cf879e93a69ae8d550a83e84edc6682ac6"

RPROVIDES:${PN} += "cmake(KPim5GAPI) cmake(KPimGAPI) libkgapi-devel libkgapi-devel(aarch-64) libkgapi5-devel"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5Contacts) libKPim5GAPIBlogger5 libKPim5GAPICalendar5 libKPim5GAPICore5 libKPim5GAPIDrive5 libKPim5GAPILatitude5 libKPim5GAPIMaps5 libKPim5GAPIPeople5 libKPim5GAPITasks5"

inherit rpm
