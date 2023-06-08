SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python311-pybars3-0.9.7-1.18.noarch.rpm"
RPM_HASH = "b07a0e63735ba28e36b4bb511832558fad40d161092723f95c0126ffefe629e1fcd83eab6150779b956f5d1139e9d01ad077da05e22c277f2311662b14fce72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybars3) python311-pybars3 python3dist(pybars3)"
RDEPENDS:${PN} += "python(abi) python311-PyMeta3"

inherit rpm
