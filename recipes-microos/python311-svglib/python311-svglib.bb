SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python311-svglib-1.1.0-2.8.noarch.rpm"
RPM_HASH = "9142c2b36156fcb176203118637e5f7be03c61dc40dc79328ddb3a1aa6f1e65422a745876f784771c91c3a6abae1f187d357a1b8106bfdeba0f4afa7d056c775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(svglib) python311-svglib python3dist(svglib)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-cssselect2 python311-lxml python311-reportlab python311-tinycss2 update-alternatives"

inherit rpm
