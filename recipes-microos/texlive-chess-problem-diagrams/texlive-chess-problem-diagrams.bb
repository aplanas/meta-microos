SUMMARY = "A package for typesetting chess problem diagrams"
DESCRIPTION = "This package provides macros to typeset chess problem diagrams \
including fairy chess problems (mostly using rotated images of \
pieces) and other boards."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.21svn63708"

RPM_NAME = "texlive-chess-problem-diagrams-2023.201.1.21svn63708-53.1.noarch.rpm"
RPM_HASH = "9d108184dc09aa0b83cfee2d0513da1713d7cf201292dda7d6056d2e96886544a7005f90d53bf91970773ed6aa2284c25ee3e63c9f6e9bfa2645e4d6ba2a8901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cpdparse.sty) tex(diagram.sty) texlive-chess-problem-diagrams"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(ifthen.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
