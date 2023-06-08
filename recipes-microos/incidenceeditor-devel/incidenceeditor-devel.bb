SUMMARY = "Development package for incidenceeditor"
DESCRIPTION = "The development package for the incidenceeditor libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "incidenceeditor-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d2d7f7eb69f1d45bc68a01ad390287b476dace361e8629336ed17d30986de2258194ad270671dff8a1bbd9167cbe945d69e1c975e099e7dc1ddec86ec9a66a70"

RPROVIDES:${PN} += "cmake(KF5IncidenceEditor) cmake(KPim5IncidenceEditor) incidenceeditor-devel incidenceeditor-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KChart) cmake(KF5CalendarCore) cmake(KPim5CalendarSupport) cmake(KPim5CalendarUtils) cmake(KPim5EventViews) cmake(KPim5MailTransportAkonadi) cmake(KPim5Mime) libKPim5IncidenceEditor5"

inherit rpm
