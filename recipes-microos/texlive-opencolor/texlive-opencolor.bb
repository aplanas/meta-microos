SUMMARY = "Definitions from the Open Color library"
DESCRIPTION = "This package provides hexadecimal color definitions of the 130 \
colors included in the Open Color library."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-2023.201.1.0.1svn66363-54.1.noarch.rpm"
RPM_HASH = "7ce47419edd485d4afb3e366270f61ebf276d90d618620eb26060acfb51740de4b671689466d3ee7d5ed71137d7c7dd3e2aa525662da1cfac4e3d5fd1515cea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(opencolor.sty) texlive-opencolor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
