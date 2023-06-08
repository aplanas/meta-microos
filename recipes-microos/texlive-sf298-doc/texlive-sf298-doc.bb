SUMMARY = "Documentation for texlive-sf298"
DESCRIPTION = "This package includes the documentation for texlive-sf298"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn41653"

RPM_NAME = "texlive-sf298-doc-2023.201.1.3svn41653-53.1.noarch.rpm"
RPM_HASH = "aa6a7fc7af61b90033f3e97650f01d6c4e6dc80f151f7d3f981d4d0ccca966518ba3212c6680c1340cef67f54628ed44f21a664f16eb30e770ad8cdbf8bdd317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sf298-doc"
RDEPENDS:${PN} += ""

inherit rpm
