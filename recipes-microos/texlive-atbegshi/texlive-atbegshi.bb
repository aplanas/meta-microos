SUMMARY = "Execute stuff at \\shipout time"
DESCRIPTION = "This package is a modern reimplementation of package everyshi, \
providing various commands to be executed before a \\shipout \
command. It makes use of e-TeX's facilities if they are \
available. The package may be used either with LaTeX or with \
plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn53051"

RPM_NAME = "texlive-atbegshi-2023.201.1.19svn53051-53.1.noarch.rpm"
RPM_HASH = "c2ee838afef30bb0bb4425b14990ea74e27220ae0e1e94cdc498a98ee15ac5dbbd14e4392407edc363d199b30bd1c6915233b718a8f01e38b7dbd4206136afb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(atbegshi.sty) \
texlive-atbegshi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(infwarerr.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
