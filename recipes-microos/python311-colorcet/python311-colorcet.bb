SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.0.1"

RPM_NAME = "python311-colorcet-3.0.1-1.5.noarch.rpm"
RPM_HASH = "4ccb6fb965793d0217ea242f273a08f30163aabe87a84c4923494ae995913ece6a0dc71bfb848fa824caae3a96c1ee8771fc5587a096308f44f6e673c596127d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colorcet) python311-colorcet python3dist(colorcet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-param python311-pyct update-alternatives"

inherit rpm
