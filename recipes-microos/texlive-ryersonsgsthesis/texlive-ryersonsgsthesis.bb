SUMMARY = "Ryerson School of Graduate Studies thesis template"
DESCRIPTION = "This package provides a LaTeX class and template files for \
Ryerson School of Graduate Studies (SGS) theses."
LICENSE = "Apache-1.0"

PV = "2023.201.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-2023.201.1.0.3svn50119-53.1.noarch.rpm"
RPM_HASH = "d09fd340bfd3292f640383052242f87f4a18d1013a27be3a7f0194f528bee1fc6f027bbf5218e0d43e6777bbc06e963012c8f0d0cbd13b8deb87e6d1704c5621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ryersonSGSThesis.cls) texlive-ryersonsgsthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(IEEEtrantools.sty) tex(algorithm.sty) tex(algorithmicx.sty) tex(algpseudocode.sty) tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(appendix.sty) tex(array.sty) tex(blindtext.sty) tex(caption.sty) tex(charter.sty) tex(cite.sty) tex(csquotes.sty) tex(float.sty) tex(geometry.sty) tex(glossaries.sty) tex(graphicx.sty) tex(listings.sty) tex(lmodern.sty) tex(longtable.sty) tex(makeidx.sty) tex(ragged2e.sty) tex(report.cls) tex(sectsty.sty) tex(setspace.sty) tex(subcaption.sty) tex(subfiles.sty) tex(titlesec.sty) tex(todonotes.sty) tex(verbatim.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
