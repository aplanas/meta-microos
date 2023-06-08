SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python310-CairoSVG-2.6.0-2.1.noarch.rpm"
RPM_HASH = "33527a7ed1d4e2364a3ef09fc42e74206bbc348eff16435a0ceeb3adc5a878dcb0f705353d2221dd46b5b892cd7ee034948bb53fdc817b5509a1d288c11a6403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CairoSVG python3.10dist(cairosvg) python310-CairoSVG python3dist(cairosvg)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Pillow python310-cairocffi python310-cssselect2 python310-defusedxml python310-tinycss2 update-alternatives"

inherit rpm
