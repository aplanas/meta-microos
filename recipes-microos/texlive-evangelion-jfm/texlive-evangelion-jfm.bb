SUMMARY = "A Japanese font metric supporting many advanced features"
DESCRIPTION = "This package provides a Japanese Font Metric supporting \
vertical and horizontal typesetting, 'linegap punctuations', \
'extended fonts', and more interesting and helpful features \
using traditional and simplified Chinese or Japanese fonts \
under LuaTeX-ja. It also makes full use of the 'priority' \
feature, meeting the standards, and allows easy customisation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0_bsvn65824"

RPM_NAME = "texlive-evangelion-jfm-2023.201.1.0.0_bsvn65824-52.1.noarch.rpm"
RPM_HASH = "f3341a2e6fb0194d66c5ccc1f41d4615c1cb1d49107a3dbc4fb05c5de12756b5f82f23a4c0bf62052d0b3718c901403d61ae8a4b094e515e472c1babc2eb1454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-evangelion-jfm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
