SUMMARY = "Draw pie-charts using MetaPost"
DESCRIPTION = "The piechartmp package is an easy way to draw pie-charts with \
MetaPost. The package implements an interface that enables \
users with little MetaPost experience to draw charts. A \
highlight of the package is the possibility of suppressing some \
segments of the chart, thus creating the possibility of several \
charts from the same data."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-2023.201.0.0.3.0svn19440-51.1.noarch.rpm"
RPM_HASH = "33ad67f076bf62cc9300bd0233f898dc1a88c87818776839bc7c12b1634bd520172f8341b90a82e8411ef35cfe3b09798a1da285c9fc6ec6cf89ff7252df9814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
