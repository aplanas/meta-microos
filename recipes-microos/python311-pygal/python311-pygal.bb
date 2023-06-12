SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python311-pygal-3.0.0-3.1.noarch.rpm"
RPM_HASH = "cd630dec65980fb7dee24517e49386b64cbc6517310b5921d41821737ebcce4261160cd2d7466b2eb5c844bcd74bad895186c5724d89c4e97f21f0dabf3e01d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygal) \
python311-pygal \
python3dist(pygal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-lxml \
update-alternatives"

inherit rpm
