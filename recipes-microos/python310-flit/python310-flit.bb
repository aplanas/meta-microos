SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python310-flit-3.8.0-4.1.noarch.rpm"
RPM_HASH = "716a1471252435c4661a62181875bbb4ca772c4984455020254480d20b7523a3b588c39ede5fa4677ea9dd4fde060f9c1cb2b76c0543aac9816c41b3094dc6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit python3.10dist(flit) python310-flit python3dist(flit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-docutils python310-flit-core python310-requests python310-tomli-w update-alternatives"

inherit rpm
