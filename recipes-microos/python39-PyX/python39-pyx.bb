SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python39-PyX-0.15-2.11.noarch.rpm"
RPM_HASH = "341f70c68812876cc0d82b4b7921fbcea9e0701765a05b56bf6c1cf79269b5792c32a5fc7d2976f10108d2287e5b99d8c61f70e8cc0f27d1a16694fbe59f475b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyx) \
python39-PyX \
python39-pyx \
python3dist(pyx)"
RDEPENDS:${PN} += "python(abi) \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
