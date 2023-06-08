SUMMARY = "A Chicago style for BibLaTeX"
DESCRIPTION = "Windy City is a style for BibLaTeX that formats notes, \
bibliographies, parenthetical citations, and reference lists \
according to the 17th edition of The Chicago Manual of Style."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61223"

RPM_NAME = "texlive-windycity-2023.201.svn61223-53.1.noarch.rpm"
RPM_HASH = "b5a249a523cff4230397400cfe1785d03bc95533416338d5263ccda48004677818efe66323041bbdf9148449b09b1550481a48a6a2e5c7eb01b5bef378d76a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(american-windycity.lbx) tex(windycity.bbx) tex(windycity.cbx) tex(windycity.sty) texlive-windycity"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(american.lbx) tex(babel.sty) tex(biblatex.sty) tex(booktabs.sty) tex(btxdockit.sty) tex(caption.sty) tex(csquotes.sty) tex(enumitem.sty) tex(fancyhdr.sty) tex(float.sty) tex(fontenc.sty) tex(fontspec.sty) tex(helvet.sty) tex(ifxetex.sty) tex(inputenc.sty) tex(pifont.sty) tex(ragged2e.sty) tex(textcomp.sty) tex(tgtermes.sty) tex(titlesec.sty) tex(tocloft.sty) tex(xltxtra.sty) tex(xunicode.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
