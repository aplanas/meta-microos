SUMMARY = "Statistics style"
DESCRIPTION = "The package defines many macros for items of significance in \
statistical presentations. It represents a syntax-incompatible \
upgrade of statex."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn23961"

RPM_NAME = "texlive-statex2-2023.201.2.1svn23961-57.1.noarch.rpm"
RPM_HASH = "a5bd54050dd8ce7c95af55bf8fd6ad86c989bb999de1a5fc6832fca2683b4e1131b42b0566c5ec3313cc220542c702b5ffbc2a1a19918d60d0005ab9b920dc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(statex2.sty) texlive-statex2"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(bm.sty) tex(color.sty) tex(ifthen.sty) tex(shortvrb.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
