SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-flit-3.8.0-4.1.noarch.rpm"
RPM_HASH = "45e38ce63a60d7391e7d924f514a4cfdf9394eea33c620449c31ded7920a31d447cfd46742c77b6359ff15a58695b466152759c3cc0e1d146b89cbc446654396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flit) python311-flit python3dist(flit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-docutils python311-flit-core python311-requests python311-tomli-w update-alternatives"

inherit rpm
