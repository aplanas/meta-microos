SUMMARY = "A build system for tex4ht"
DESCRIPTION = "make4ht is a simple build system for tex4ht, a TeX to XML \
converter. It provides a command line tool that drives the \
conversion process. It also provides a library which can be \
used to create customized conversion tools."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3msvn66130"

RPM_NAME = "texlive-make4ht-2023.201.0.0.3msvn66130-52.1.noarch.rpm"
RPM_HASH = "1c4e7f9bdae1e3bf4a94f300d9afbb51663bbe9575346111a1ae47ddeee59938e40a1eaf9e147e07e85b9edbcf11dd382784cfbab9cd5b6fdaef70004acc1e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht"
RDEPENDS:${PN} += "/bin/sh /usr/bin/luatex /usr/bin/texlua coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-make4ht-bin texlive-scripts texlive-scripts-bin texlive-tex4ht"

inherit rpm
