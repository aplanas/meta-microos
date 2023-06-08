SUMMARY = "Documentation for texlive-skeyval"
DESCRIPTION = "This package includes the documentation for texlive-skeyval"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn30560"

RPM_NAME = "texlive-skeyval-doc-2023.201.1.3svn30560-57.1.noarch.rpm"
RPM_HASH = "bdb552f917c0e7b8591083e7e2ca8e7c08859c5b24c91bb8312a250724e831e4fdece336ce4c64661a36f5b9f9cd3d454a77cce2749740580d02025b718708f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeyval-doc"
RDEPENDS:${PN} += ""

inherit rpm
