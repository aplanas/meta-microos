SUMMARY = "Development package for incidenceeditor"
DESCRIPTION = "The development package for the incidenceeditor libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "incidenceeditor-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a9cc9345a20f9ec964ea2f283d4facd5b1d51521154a7ff1d069a4d11277b898ff1c370fea182c146e1a262cacb3795a898ee9fb20beb2cdc3f9b0f86d6ed2b0"

RPROVIDES:${PN} += "cmake(KF5IncidenceEditor) cmake(KPim5IncidenceEditor) incidenceeditor-devel incidenceeditor-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KChart) cmake(KF5CalendarCore) cmake(KPim5CalendarSupport) cmake(KPim5CalendarUtils) cmake(KPim5EventViews) cmake(KPim5MailTransportAkonadi) cmake(KPim5Mime) libKPim5IncidenceEditor5"

inherit rpm
