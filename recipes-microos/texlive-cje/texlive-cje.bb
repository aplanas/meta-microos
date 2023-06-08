SUMMARY = "LaTeX document class for CJE articles"
DESCRIPTION = "The cje article class allows authors to format their papers to \
Canadian Journal of Economics style with minimum effort. The \
class includes options for two other formats: 'review' (double \
spaced, for use at the submission stage) and 'proof' (used by \
the typesetters to prepare the proof authors will receive for \
approval)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn46721"

RPM_NAME = "texlive-cje-2023.201.1.06svn46721-53.1.noarch.rpm"
RPM_HASH = "badc6978dc11242af93d7a7d035172a717cc83f912d5b286fd2d935358a91d3952ec0a7cfb92ed2f620524a2efc33e51061b29302f81538dd652cae873aa6d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cje.cls) tex(cjenatbib.sty) tex(cjeupmath.sty) texlive-cje"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsbsy.sty) tex(amssymb.sty) tex(lineno.sty) tex(natbib.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
