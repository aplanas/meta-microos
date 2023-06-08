SUMMARY = "Represent intervals on the number line"
DESCRIPTION = "This package provides macros to simplify the process of \
representing intervals on the number line. It depends on \
tkz-fct, ifthen, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn58328"

RPM_NAME = "texlive-nl-interval-2023.201.1.0svn58328-54.1.noarch.rpm"
RPM_HASH = "9d5ad1faae3740e586cbdd115c2719c65ab7f973b7bb7cce8926340105b76e8e3a553ff61ac9cf6a3df998e65d29925c23654e91c2f83c9b3b4d394761a745b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nl-interval.sty) texlive-nl-interval"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(tkz-fct.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
