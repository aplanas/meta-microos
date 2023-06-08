SUMMARY = "Documentation for texlive-checkcites"
DESCRIPTION = "This package includes the documentation for texlive-checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn64155"

RPM_NAME = "texlive-checkcites-doc-2023.201.2.6svn64155-53.1.noarch.rpm"
RPM_HASH = "05bc455129d89e72cc0d39c44b3295cbf9b5534244c45155e686d6dd3c3c093929db8731412955604dbb29adcba3f852813f4a59969a685df75e3f760e6f2048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites-doc"
RDEPENDS:${PN} += ""

inherit rpm
