SUMMARY = "Python library to capitalize strings"
DESCRIPTION = "This filter changes all words to Title Caps, and attempts to be \
clever about SMALL words like a/an/the in the input. \
 \
The list of 'SMALL words' which are not capped comes from the New \
York Times Manual of Style, plus some others like 'vs' and 'v'."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python39-titlecase-2.4-1.4.noarch.rpm"
RPM_HASH = "4a9efcad24870e68d5650aa2fbacd69c71dece4415959c1c1692f9c32ba99aad1aac8d428ab03240dda1777c779c355e24724cc6d6073ca94b8e481b292edbf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(titlecase) python39-titlecase python3dist(titlecase)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-regex update-alternatives"

inherit rpm
