SUMMARY = "Powerdot, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a powerdot-derived class and a package for \
use with powerdot to provide the corporate design of the Free \
University in Berlin. Users may use the class itself \
(FUpowerdot) or use the package in the usual way with \
\\style=BerlinFU as a class option. Examples of using both the \
class and the package are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-2023.201.0.0.02asvn52922-52.1.noarch.rpm"
RPM_HASH = "35f700a0c6a4861bc5b15f77f76a5578dc7998f43a22fa750f5af3caba38e867ddd897a8bc8c9df8dac10054687cdac41d40322fbe19bf3e968f7d1753251c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(FUpowerdot.cls) \
tex(powerdot-BerlinFU.sty) \
texlive-powerdot-fuberlin"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(breakurl.sty) \
tex(calc.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(helvet.sty) \
tex(pifont.sty) \
tex(powerdot.cls) \
tex(ragged2e.sty) \
tex(tabularx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
