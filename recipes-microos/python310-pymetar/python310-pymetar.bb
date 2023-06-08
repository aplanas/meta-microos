SUMMARY = "METAR weather report parser"
DESCRIPTION = "This library downloads the weather report for a given station ID, decodes \
it and provides easy access to all the data found in the report."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "python310-pymetar-1.1-2.13.noarch.rpm"
RPM_HASH = "cbae62286531e1350fa36cbe87caac77d6e35a953529b7e13e9ef372484402e2fc11c5dbab1c228fc58dc553dbb0a6df5a0279624f87abf05f33ab72ea434a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymetar python3.10dist(pymetar) python310-pymetar python3dist(pymetar)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
