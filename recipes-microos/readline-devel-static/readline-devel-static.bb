SUMMARY = "Static library for development with readline"
DESCRIPTION = "This package contains the static library for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-devel-static-8.2-2.3.aarch64.rpm"
RPM_HASH = "ed4dd204213bc08e638d889fe2472f42773575cc39d8977e31b90bf8cdbf4a28b5b01a481c4d9861c28df0cd0dd216ab6a7bf2c2f6082f5662917d9eb506b320"

RPROVIDES:${PN} += "readline-devel-static readline-devel-static(aarch-64)"
RDEPENDS:${PN} += "ncurses-devel readline-devel"

inherit rpm
