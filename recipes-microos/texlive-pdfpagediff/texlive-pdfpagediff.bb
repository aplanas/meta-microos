SUMMARY = "Find difference between two PDF's"
DESCRIPTION = "Find difference between two PDF's"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-2023.201.1.4svn37946-51.1.noarch.rpm"
RPM_HASH = "0a9161c4edc92d0ff1cbddcb5b6dd67a9191b1db2aa4f741f4fa7a9bad3579e953ccd801bf8ad7df582afa58a6605c4be517eac795f7c7d8af880053d251d2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfpagediff.sty) texlive-pdfpagediff"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(geometry.sty) tex(graphicx.sty) tex(substr.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
