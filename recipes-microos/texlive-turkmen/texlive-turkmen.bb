SUMMARY = "Babel support for Turkmen"
DESCRIPTION = "The package provides support for Turkmen in babel, but \
integration with babel is not available."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17748"

RPM_NAME = "texlive-turkmen-2023.201.0.0.2svn17748-52.1.noarch.rpm"
RPM_HASH = "7124ec312760ea5468727a736c6a1d0c52be159e5a445f7850703a9730167bf3a87b145fd5b22e2dbc02907a94ef5c43b295c3feb88627bbd8ba5dbf9a80a554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(turkmen.ldf) texlive-turkmen"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
