SUMMARY = "Place boxes at arbitrary positions on the LaTeX page"
DESCRIPTION = "A package to facilitate placement of boxes at absolute \
positions on the LaTeX page. There are several reasons why this \
might be useful, an important one being to help the creation of \
large-format conference posters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10.1svn63967"

RPM_NAME = "texlive-textpos-2023.201.1.10.1svn63967-54.1.noarch.rpm"
RPM_HASH = "34e7e145b8afa511e2955839925fdca0bfbc1ed8575d4f798b4ff071101ae27de673ec0f56debb88c718ada440534263b34ef58018f9bb3cfb3cc0b4c5f698b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textpos.sty) texlive-textpos"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(everyshi.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
