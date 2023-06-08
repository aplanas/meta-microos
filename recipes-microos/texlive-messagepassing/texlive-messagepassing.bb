SUMMARY = "Draw diagrams to represent communication protocols"
DESCRIPTION = "This package provides an environment to easily draw diagrams to \
represent communication protocols using message passing among \
processes. Processes are represented as horizontal or vertical \
lines, and communications as arrows between lines. The package \
also provides multiple macros to decorate those diagrams, for \
instance to annotate the diagram, to add crashes to the \
processes, checkpoints, ..."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63116"

RPM_NAME = "texlive-messagepassing-2023.201.1.0svn63116-54.1.noarch.rpm"
RPM_HASH = "20b2d5cadf3b8790eec4926fd124e30b897243bd076edd8553e6bfab434ab52026f57015413bec6e8335d60c10720ef552ba506d696146c6d69fe40d8502ad61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(messagepassing.sty) texlive-messagepassing"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(float.sty) tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
