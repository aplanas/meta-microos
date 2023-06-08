SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python311-termstyle-0.1.11-7.10.noarch.rpm"
RPM_HASH = "79c01ab453123b1cb454e7a09026ced3121a2457a34c9fb7e494bd9ef8e1d884109a2c5dd5526e88b202054decf196131d74518476b3a80745905fc69b83bb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(termstyle) python311-python-termstyle python311-termstyle python3dist(termstyle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
