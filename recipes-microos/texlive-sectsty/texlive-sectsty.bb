SUMMARY = "Control sectional headers"
DESCRIPTION = "A LaTeX2e package to help change the style of any or all of \
LaTeX's sectional headers in the article, book, or report \
classes. Examples include the addition of rules above or below \
a section title."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.2svn15878"

RPM_NAME = "texlive-sectsty-2023.201.2.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "04feb87ef683ac254e32b1c78ed36838f3f8270edd26c83f54b0714ed28aa35ad3b95a84b4a7ae5361c4af75724f97f1bf5d0f3f9cb076c5b2819b8ce2847177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sectsty.sty) \
texlive-sectsty"
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
