SUMMARY = "Short introduction to LaTeX, in Mongolian"
DESCRIPTION = "A translation of Oetiker's Not so short introduction."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.26svn15878"

RPM_NAME = "texlive-lshort-mongol-2023.201.4.26svn15878-54.1.noarch.rpm"
RPM_HASH = "946aa84ef2b25d5c98ac63067288faeac73584dc537b4949f98fdd3dc824324e7f7a0fc45ffab593877feb6fd68805ed3a70ebcade84f11b326d338cda1ae475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-mongol"
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
