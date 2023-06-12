SUMMARY = "A package for typesetting (short) poems"
DESCRIPTION = "A redefinition of the verse environment to make the \\\\ command \
optional for line ends and to give it a possibility of optical \
centering and `right-hanging' alignment of lines broken because \
of length."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-2023.201.0.0.73svn29803-53.1.noarch.rpm"
RPM_HASH = "6fcbf92fff00d8bcf903810761fc539b9b04ae22fe5bcfd0d5413e2581badfaab2571fd8115252db3a677c1a502af205a07051c9e7ea5c1ba248496b4377bcf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gmverse.sty) \
texlive-gmverse"
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
