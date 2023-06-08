SUMMARY = "An OTF math font matching EB Garamond"
DESCRIPTION = "Garamond-Math is an open type math font matching EB Garamond \
(Octavio Pardo) and EB Garamond (Georg Mayr-Duffner). Many \
mathematical symbols are derived from other fonts, others are \
made from scratch. The metric is generated with a Python \
script. Issues, bug reports and other contributions are \
welcome."
LICENSE = "OFL-1.1"

PV = "2023.201.svn61481"

RPM_NAME = "texlive-garamond-math-2023.201.svn61481-52.1.noarch.rpm"
RPM_HASH = "858609a81c57e2e6b5c12e10a6f05734292005db77de57553c3db35f4c47811fcc655ee6b67edc350020bb6bc5aeb4e61bd8a3651a23869ffaee36077a422334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-garamond-math-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
