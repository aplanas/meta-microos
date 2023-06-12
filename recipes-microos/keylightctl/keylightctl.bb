SUMMARY = "CLI for managing Elgato Keylight (Air)"
DESCRIPTION = "A command line tool for controlling Elgato Key Lights and Key Light Airs."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "keylightctl-0.0.3-1.3.aarch64.rpm"
RPM_HASH = "aa4d23263606acf58251c331f7080469bfdfd9e27ca266220be28e11bf649dc6263f6d1cc9299c552e190857dcf6ef48c0ffda3ff6afea33f21cf574b8808339"

RPROVIDES:${PN} += "keylightctl \
keylightctl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
