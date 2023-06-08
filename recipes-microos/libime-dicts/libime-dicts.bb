SUMMARY = "Dictionary files for libime"
DESCRIPTION = "This package provides dictionary files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-dicts-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "19ccbc75241e60ec7460641e5d701bccd6ad3f225a912b85710b0079eb9b55b861b5179a912c0d4f4048ce876f96581b6a4fcff661094d04ff3d3378c66f0a98"

RPROVIDES:${PN} += "libime-dicts libime-dicts(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
