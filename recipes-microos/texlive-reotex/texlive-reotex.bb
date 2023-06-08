SUMMARY = "Draw Reo Channels and Circuits"
DESCRIPTION = "The package defines macros and other utilities to design Reo \
Circuits. The package requires PGF/TikZ support."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34924"

RPM_NAME = "texlive-reotex-2023.201.1.1svn34924-53.1.noarch.rpm"
RPM_HASH = "003e732a1b4d1f32bfd8954b96691a164a381998aee733af3bcafe1f8a91dcdc5192feab0888baa932ba1fcbb74af86deb151870e90ef71e95cb1b917961ba73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(reotex.sty) texlive-reotex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(tikz.sty) tex(verbatim.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
