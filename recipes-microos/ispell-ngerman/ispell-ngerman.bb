SUMMARY = "New German ispell dictionary"
DESCRIPTION = "This package includes a ready German dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell."
LICENSE = "BSD-3-Clause"

PV = "20161207"

RPM_NAME = "ispell-ngerman-20161207-2.14.aarch64.rpm"
RPM_HASH = "d914f34e339f324fb6b81932774418b4d271ad526a4c90b3294918581a6c5242e95295616ae52597318dbf93fcb8544407052b068250b2f435fe78a76c4e2abc"

RPROVIDES:${PN} += "ispell-ngerman ispell-ngerman(aarch-64) ispell_dictionary locale(ispell:de;de_DE)"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
