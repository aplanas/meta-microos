SUMMARY = "Documentation for texlive-boxedminipage"
DESCRIPTION = "This package includes the documentation for texlive-boxedminipage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54827"

RPM_NAME = "texlive-boxedminipage-doc-2023.201.1.1svn54827-52.1.noarch.rpm"
RPM_HASH = "e00db1d27e3fca1f8404fa1bd04aae3e75d32ed303dca445735b9e70c302536bc17b72438729062f27c417600827a127e27b31bc09a9dcfa66dd5636448e466b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxedminipage-doc"
RDEPENDS:${PN} += ""

inherit rpm
