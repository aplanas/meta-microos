SUMMARY = "An implementation of lxml.xmlfile for the standard library"
DESCRIPTION = "et_xmlfile is a low memory library for creating large XML files. \
 \
It is based upon the xmlfile module from lxml with the aim of allowing code to \
be developed that will work with both libraries. It was developed initially for \
the openpyxl project but is now a standalone module."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-et_xmlfile-1.0.1-3.14.noarch.rpm"
RPM_HASH = "67468d7d63992c57f4e49326a8dd9db655f7845d4b6365a2ee683f83b97bd6843139a7cb69f7c99e50a80271ee6f39e0f62706e8334bae3e70da83cd74346ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(et-xmlfile) python311-et_xmlfile python3dist(et-xmlfile)"
RDEPENDS:${PN} += "python(abi) python311-jdcal python311-lxml"

inherit rpm
