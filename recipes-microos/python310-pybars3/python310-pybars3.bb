SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python310-pybars3-0.9.7-1.18.noarch.rpm"
RPM_HASH = "ff8cceb162fa5638d5db7c4b120107d1cca9698a10be0564e83acdff11b260438ccb4a0b163b83bdabd14c9a809899e76a99ab95e0285a72b31e7f900a2791cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybars3 \
python3.10dist(pybars3) \
python310-pybars3 \
python3dist(pybars3)"
RDEPENDS:${PN} += "python(abi) \
python310-PyMeta3"

inherit rpm
