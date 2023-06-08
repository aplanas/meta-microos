SUMMARY = "Documentation for python-pygraphviz"
DESCRIPTION = "This package provides documentation and help files for python-pygraphviz"
LICENSE = "BSD-3-Clause"

PV = "1.10"

RPM_NAME = "python-pygraphviz-doc-1.10-1.3.aarch64.rpm"
RPM_HASH = "a47c96fb74a6b5a00174ffd5643505cb5dd8c259e77edfd1fa264dfc7e019039ef2282f6b0f571d959a3324d4df7f6ce782c58983d5c49644a7032dfc0071db6"

RPROVIDES:${PN} += "python-pygraphviz-doc python-pygraphviz-doc(aarch-64) python310-pygraphviz-doc python311-pygraphviz-doc python39-pygraphviz-doc"
RDEPENDS:${PN} += ""

inherit rpm
