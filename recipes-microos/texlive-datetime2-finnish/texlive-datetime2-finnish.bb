SUMMARY = "Finnish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'finnish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-2023.201.1.2svn47047-52.1.noarch.rpm"
RPM_HASH = "71e2b792a745286e20f8b7f8858e29fe5b9ec321d7b48ce6d20f7d23294ac5cc211bdd7c4e2e9ba52f35b20d0bfc28bca9ff77d0063938942f1bac39afab9680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-finnish-ascii.ldf) tex(datetime2-finnish-utf8.ldf) tex(datetime2-finnish.ldf) texlive-datetime2-finnish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
