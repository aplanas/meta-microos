SUMMARY = "Nodes and node connections in PSTricks"
DESCRIPTION = "The package enables the user to connect information, and to \
place labels, without knowing (in advance) the actual positions \
of the items to be connected, or where the connecting line \
should go. The macros are useful for making graphs and trees, \
mathematical diagrams, linguistic syntax diagrams, and so on. \
The package contents were previously distributed as a part of \
the pstricks base distribution; the package serves as an \
extension to PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.43svn61838"

RPM_NAME = "texlive-pst-node-2023.201.1.43svn61838-52.1.noarch.rpm"
RPM_HASH = "99f137b85f7ac563ae50a4d65712b44296aa30cde4b34f3a0a105a3d471a227ad7fac213f5c51d4ee26238a2287cc5fff0b07e8df8f7a7443b757352b4beaf96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-node.sty) tex(pst-node.tex) tex(pst-node97.tex) texlive-pst-node"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
