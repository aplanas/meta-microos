SUMMARY = "PostScript versions of the ESSTIX, with macro support"
DESCRIPTION = "These fonts represent translation to PostScript Type 1 of the \
ESSTIX fonts. ESSTIX seem to have been a precursor to the STIX \
project, and were donated by Elsevier to that project. The \
accompanying virtual fonts with customized metrics and LaTeX \
support files allow their use as calligraphic, fraktur and \
double-struck (blackboard bold) in maths mode."
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn22426"

RPM_NAME = "texlive-esstix-2023.201.1.0svn22426-52.1.noarch.rpm"
RPM_HASH = "bca6dd6bddbc4761d2c23715a6121794b0e6dfd4a3cfd9e3d99aab42a748d6144c15e44ab1743347d0bcdccafe641ee0e72f1ff04bb37c04e09e2d63f42a8526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ESSTIX.map) tex(esstixbb.sty) tex(esstixbb.tfm) tex(esstixbb.vf) tex(esstixcal.sty) tex(esstixcal.tfm) tex(esstixcal.vf) tex(esstixfrak.sty) tex(esstixfrak.tfm) tex(esstixfrak.vf) tex(rESSTIX13.tfm) tex(rESSTIX14.tfm) tex(rESSTIX15.tfm) tex(uesstixbb.fd) tex(uesstixcal.fd) tex(uesstixfrak.fd) texlive-esstix"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cmr10.tfm) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-esstix-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
