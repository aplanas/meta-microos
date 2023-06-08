SUMMARY = "Beamer, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a beamer-derived class and a theme style \
file for the corporate design of the Free University in Berlin. \
Users may use the class itself (FUbeamer) or use the theme in \
the usual way with \\usetheme{BerlinFU}. Examples of using both \
the class and the theme are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-2023.201.0.0.02bsvn63161-53.1.noarch.rpm"
RPM_HASH = "be9c213bae9af85d14d7e23b80e6687058f0f0d29d1045d618a6eb86ccd58951bc6c1c77f12c3a70b5840859d217ea7fd5fed365a36fd2d14aefb8bbc0340cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(FUbeamer.cls) tex(beamercolorthemeBerlinFU.sty) tex(beamerfontthemeBerlinFU.sty) tex(beamerouterthemeBerlinFU.sty) tex(beamerthemeBerlinFU.sty) texlive-beamer-fuberlin"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(beamer.cls) tex(fontenc.sty) tex(graphicx-psmin.sty) tex(graphicx.sty) tex(helvet.sty) tex(tabularx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
