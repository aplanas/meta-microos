SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kitinerary-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e75e94f53467ec74df633493c29647df5d6515988236f243d42c46f8cee119d0cffa8569daa1b12f7233b3bca345b2fa749758f2ad2ebadeb0389cc4472a711c"

RPROVIDES:${PN} += "cmake(KPim5Itinerary) cmake(KPimItinerary) kitinerary-devel kitinerary-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5Contacts) cmake(KF5Mime) cmake(KPim5PkPass) cmake(Qt5Gui) libKPim5Itinerary5 libqt5-qtdeclarative-private-headers-devel"

inherit rpm
