SUMMARY = "Documentation for texlive-bidicontour"
DESCRIPTION = "This package includes the documentation for texlive-bidicontour"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34631"

RPM_NAME = "texlive-bidicontour-doc-2023.201.0.0.2svn34631-53.1.noarch.rpm"
RPM_HASH = "59fb131596c15f897fdca293d40a9a962f492050023d13d5fc1de9b66c3a7e25c2bcb0d629e284444c65a29a3f0f7eb7801d4477cac1e93a9afcb4cc48d6c10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidicontour-doc"
RDEPENDS:${PN} += ""

inherit rpm
