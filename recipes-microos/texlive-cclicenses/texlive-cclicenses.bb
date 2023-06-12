SUMMARY = "Typeset Creative Commons licence logos"
DESCRIPTION = "The cclicenses package helps users typesetting Creative Commons \
logos in LaTeX. It defines some commands useful to quickly \
write these logos, related to CC licences versions 1.0 and 2.0."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cclicenses-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "733c3e8951cdd092236b28db5fac67300c6294708ee1a28fbe3be556bb315c83e2345f9b396d7824173fcf743691b6eafecc2f47bd61ecb6fdcd8828e696f23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cclicenses.sty) \
texlive-cclicenses"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(rotating.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
