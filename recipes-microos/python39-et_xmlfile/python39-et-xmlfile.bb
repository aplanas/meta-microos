SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-et_xmlfile-1.0.1-3.14.noarch.rpm"
RPM_HASH = "bc66b7c97155bbdf8f8244f3f6ded39777412952c5003fc5981f8faa304a3b45d6dc0251c5e30a1529076080042ba8c531a2f3123b184ae485f68f77b96d76f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(et-xmlfile) python39-et_xmlfile python3dist(et-xmlfile)"
RDEPENDS:${PN} += "python(abi) python39-jdcal python39-lxml"

inherit rpm
