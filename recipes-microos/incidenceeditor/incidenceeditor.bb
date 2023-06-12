SUMMARY = "Incidenceeditor library"
DESCRIPTION = "This package contains the incidenceeditor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "incidenceeditor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4786a192e2c7d34b4b432e34f9414ec1954c744a11f233817966fccc01d073f0f63c35a6430022f29f541f78a5948036ac1ba45d0468a917970afdb24dcccaaf"

RPROVIDES:${PN} += "incidenceeditor \
incidenceeditor(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
