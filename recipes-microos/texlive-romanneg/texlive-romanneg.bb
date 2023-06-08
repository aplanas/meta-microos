SUMMARY = "Roman page numbers negative"
DESCRIPTION = "Causes the page numbers in the DVI file (as defined by \\count0) \
to be negative when roman pagenumbering is in effect."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20087"

RPM_NAME = "texlive-romanneg-2023.201.svn20087-53.1.noarch.rpm"
RPM_HASH = "9028fc2c16814d72d6d076eb7eeed21a0df5685830174c5401a900ac3e52a52a24cd6481ece3ba545a31fd3c6c8a749c85de7807f79643d0f1093786eb84e4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romanneg.sty) texlive-romanneg"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
