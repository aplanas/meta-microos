SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python39-CairoSVG-2.6.0-2.1.noarch.rpm"
RPM_HASH = "84e9ccf178398b08c85109fa358bf584b7d29ab7c761ea06fb3126fc43812cae0009165610f52b748847a29a9d0429a7f69994bf07cdde9f7144d38d4fc85510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cairosvg) python39-CairoSVG python3dist(cairosvg)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Pillow python39-cairocffi python39-cssselect2 python39-defusedxml python39-tinycss2 update-alternatives"

inherit rpm
