SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-et_xmlfile-1.0.1-3.14.noarch.rpm"
RPM_HASH = "9f1dc999e6cd060bf9d395a0393fe076527c1409a08a0524c641266bb86988aa9b7881c60145d2f773fae81abf502189944e42b1cda8623422b00737b19f4129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-et_xmlfile python3.10dist(et-xmlfile) python310-et_xmlfile python3dist(et-xmlfile)"
RDEPENDS:${PN} += "python(abi) python310-jdcal python310-lxml"

inherit rpm
