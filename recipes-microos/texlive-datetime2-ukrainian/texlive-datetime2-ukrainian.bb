SUMMARY = "Ukrainian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'ukrainian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-2023.201.1.2asvn47552-52.1.noarch.rpm"
RPM_HASH = "04213650b80e06cd7d4a1a65ab47ee652ed1c60a9b2aba9c1bac79675749d548e25d1fb279751c2a6098933bc86c11de3f9bc01b481b4a40616d9a3e90497982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-ukrainian-ascii.ldf) tex(datetime2-ukrainian-utf8.ldf) tex(datetime2-ukrainian.ldf) texlive-datetime2-ukrainian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
