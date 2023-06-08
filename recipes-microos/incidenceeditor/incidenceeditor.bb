SUMMARY = "Incidenceeditor library"
DESCRIPTION = "This package contains the incidenceeditor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "incidenceeditor-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e88eba7976ccee2d9694600f2b9694889bd53aa457f750de104fe7f9fd0a55852bdd2bf4ecbe019d11c01be9baef39367be72921160935de29e9846ff08997de"

RPROVIDES:${PN} += "incidenceeditor incidenceeditor(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
