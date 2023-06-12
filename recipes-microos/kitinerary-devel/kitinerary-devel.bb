SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kitinerary-devel-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "f8072acba4c0f4588b6e59bfebc63e3386ffa469e11e341647c4b306f6b699feab45cd8cc30fff3b8e1cc947e6b9acf63a96ba19fc48b5534175bf4421054455"

RPROVIDES:${PN} += "cmake(KPim5Itinerary) cmake(KPimItinerary) kitinerary-devel kitinerary-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5Contacts) cmake(KF5Mime) cmake(KPim5PkPass) cmake(Qt5Gui) libKPim5Itinerary5 libqt5-qtdeclarative-private-headers-devel"

inherit rpm
