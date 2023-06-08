SUMMARY = "A small package to set arbitrary sizes for the main font of the document"
DESCRIPTION = "The package allows you to set arbitrary sizes for the main font \
of the document, through the fontsize=<size> option."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.5svn60161"

RPM_NAME = "texlive-fontsize-2023.201.0.0.8.5svn60161-52.1.noarch.rpm"
RPM_HASH = "519e33c7ab1dc0e75670864d6ef977270c73f062b8891899dc487e532f44fc94edcd2a45302b0ff69cfc38d67eb567540dc92fd91df84eea1c645daea461519c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontsize.sty) texlive-fontsize"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xfp.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
