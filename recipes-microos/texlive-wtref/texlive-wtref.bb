SUMMARY = "Extend LaTeX's cross-reference system"
DESCRIPTION = "This package extends the cross-reference system of LaTeX2e and \
introduces concepts of namespace and scope. It also allows \
users to customize reference formats. The package is part of \
the WT Series. Prerequisite packages: xparse and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-2023.201.0.0.4.0svn55558-52.1.noarch.rpm"
RPM_HASH = "badd033b3f6024d6eb4be669223b72ed043a54866334469539ced0fbfb303894746e22626cc03a5a7c47088467412f4b287ad7c67f6396ca0258890f99ba6085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wtref.sty) texlive-wtref"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
