SUMMARY = "Extend math family up to 256 for pLaTeX/upLaTeX/Lamed"
DESCRIPTION = "This package increases the upper limit of math symbols up to \
256, using \\omath... primitives. These primitives were \
originally introduced in Omega and are currently available in \
the following formats: pLaTeX (runs on e-pTeX), upLaTeX (runs \
on e-upTeX), Lamed (runs on Aleph, successor of Omega)."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-2023.201.0.0.5svn53519-52.1.noarch.rpm"
RPM_HASH = "ce5c75dd1737034c4a683d24cf268c935c466e92a6ca8e1d036711f9c3c8f6c4c254e34460294161f70a8d02732c3bee2d0ab47e0f37f726047454056cab7849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathfam256.sty) \
texlive-mathfam256"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
