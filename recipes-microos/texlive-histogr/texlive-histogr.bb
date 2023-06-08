SUMMARY = "Draw histograms with the LaTeX picture environment"
DESCRIPTION = "This is a collection pf macros to draw histogram bars inside a \
LaTeX picture-environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-histogr-2023.201.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "1257e7813593d7f7a9817d735069ad84d84dd206887e75b2f1f4e449567f87f9e3553f4b7e2ffd3a207acc08c11d5f6dbed1ba34c12f43dd2bffaf825c019508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(histogr.sty) texlive-histogr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
