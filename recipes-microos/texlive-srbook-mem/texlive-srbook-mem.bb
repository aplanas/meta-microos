SUMMARY = "Support for use of memoir in Serbian"
DESCRIPTION = "The package provides a number of commands for adjusting memoir \
output to Serbian style."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn45818"

RPM_NAME = "texlive-srbook-mem-2023.201.svn45818-57.1.noarch.rpm"
RPM_HASH = "1ef247da094f5ae11ae5d6d5d8f345b66849d0f0d2a543ff4884921d793e84796154b178b1e2b12261d137ed3d5e15e195172bfd12e0cc229f6794cc1877e5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(srbook-mem.sty) \
texlive-srbook-mem"
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
