SUMMARY = "LaTeX Reference Sheet for a thesis with KOMA-Script"
DESCRIPTION = "This LaTeX Reference Sheet is for writing a thesis using the \
KOMA-Script document classes (scrartcl, scrreprt, scrbook) and \
all the packages needed for a thesis in natural sciences."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn45076"

RPM_NAME = "texlive-latex-refsheet-2023.201.1.2svn45076-55.1.noarch.rpm"
RPM_HASH = "e3169267836b559120e5bcce79ae30a927fbedf50a362889a9e5dce7f358980c04e275896de8f590cdf69f9ff2482f7fdbf9481ca20a5d0629765df24373e806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-refsheet"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
