SUMMARY = "Lightweight python wrapper for Apache Solr"
DESCRIPTION = "Lightweight python wrapper for Apache Solr."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python39-pysolr-3.9.0-2.6.noarch.rpm"
RPM_HASH = "9d0bfc5e1ca1f7053efe142966c9111940040eff7110396b1c8731a7824cf583347a672e028e20f85842e35b723c2cd05f716d30341227eb5b5aae8b7395b0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysolr) python39-pysolr python3dist(pysolr)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
