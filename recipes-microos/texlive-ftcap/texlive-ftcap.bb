SUMMARY = "Allows \\caption at the beginning of a table-environment"
DESCRIPTION = "For several reasons a \\caption may be desirable at the top of a \
table environment. This package changes the table environment \
such that \\abovecaptionskip and \\belowcaptionskip are swapped. \
The package should also work with a non-standard table \
environment."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn17275"

RPM_NAME = "texlive-ftcap-2023.201.1.4svn17275-52.1.noarch.rpm"
RPM_HASH = "34145f31d47e08428673465273bea8d14940d1ffb69c98b675823a2c937b77bcdaaef307acbb6afebeb83f24bba3c98ebecefbb5c7c9383dbf6a95d0a72ba2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ftcap.sty) texlive-ftcap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
