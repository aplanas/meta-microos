SUMMARY = "Make Classic Cyrillic CM fonts accessible in LaTeX"
DESCRIPTION = "The package makes the classic CM Cyrillic fonts accessible for \
use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-lcyw-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "63909cb19c77af09671eeddc6617aaa5dd0be769799fd39bea98ce90cb3f6c68882c4d6e4faef321b58949443277545d9d2c2511697bcfb74356bc28f8102c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmap-cyr-vf.sty) tex(lcywcmr.fd) tex(lcywcmss.fd) tex(lcywcmssq.fd) tex(lcywcmtt.fd) tex(lcywenc.def) texlive-lcyw"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifpdf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
