SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python311-CairoSVG-2.6.0-2.1.noarch.rpm"
RPM_HASH = "05aab2611f91348ed546f5b865f451cfc6896f1bcfd51edfab5da2854d9dee7e0e03c4a802ea2e3c7d0e50b6570e1aaa13698d0fedc355780e647aa0538d2105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cairosvg) python311-CairoSVG python3dist(cairosvg)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Pillow python311-cairocffi python311-cssselect2 python311-defusedxml python311-tinycss2 update-alternatives"

inherit rpm
