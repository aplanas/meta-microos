SUMMARY = "Class for dissertations and theses at the University of Oregon"
DESCRIPTION = "The class generates documents that are suitable for submission \
to the Graduate School and conform with the style requirements \
for dissertations and theses as laid out in the Fall 2010 UO \
graduate school student manual."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-2023.201.2.5.6svn25355-53.1.noarch.rpm"
RPM_HASH = "73de3a823c24727ff126434bcbf9449eafc0d7c5b91042ce839465e020c097d086ef26191a09664a4844755f5ef9c1ac845ebeb257155a85e1b9e2f378d33a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uothesis.cls) texlive-uothesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(draftwatermark.sty) tex(float.sty) tex(graphicx.sty) tex(hyperref.sty) tex(layouts.sty) tex(lineno.sty) tex(lipsum.sty) tex(mhchem.sty) tex(natbib.sty) tex(ragged2e.sty) tex(report.cls) tex(setspace.sty) tex(subfig.sty) tex(todonotes.sty) tex(xcolor.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
