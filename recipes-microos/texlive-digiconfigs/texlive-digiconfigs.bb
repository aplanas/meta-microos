SUMMARY = "Writing 'configurations'"
DESCRIPTION = "In Stochastic Geometry and Digital Image Analysis some problems \
can be solved in terms of so-called 'configurations'. A \
configuration is basically a square matrix of \\circ and \\bullet \
symbols. This package provides a convenient and compact \
mechanism for displaying these configurations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "c591335fa4466fa85c163b3691ca1883501769e33a6c683d94472d2743546cfab22fe8dfe0e3788d9bc9f29e12794b1157ee9bb8095f91e3c1f77b23104cd191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(digiconfigs.sty) texlive-digiconfigs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
