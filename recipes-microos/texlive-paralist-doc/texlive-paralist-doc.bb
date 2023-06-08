SUMMARY = "Documentation for texlive-paralist"
DESCRIPTION = "This package includes the documentation for texlive-paralist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn43021"

RPM_NAME = "texlive-paralist-doc-2023.201.2.7svn43021-51.1.noarch.rpm"
RPM_HASH = "076b209e20e364023cdedeffbabaa44cc927cff5bd7be2044614890b6373fd5c3a84c4c944b616a346357d2a94f9de955f29c980b7e6b855f37dae0d5191a732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paralist-doc"
RDEPENDS:${PN} += ""

inherit rpm
