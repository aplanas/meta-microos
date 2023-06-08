SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python310-pykickstart-3.43-2.2.noarch.rpm"
RPM_HASH = "9a51652711fb4cb6233aec4b56dd05bebf56c57b89c8055039ca99cd9ed16e0f5d65fc81da2e6a38b95d4dfa65101de67ea047a44de16240389b69f9dcca25a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykickstart python3.10dist(pykickstart) python310-pykickstart python3dist(pykickstart)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-requests"

inherit rpm
