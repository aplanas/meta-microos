SUMMARY = "Documentation for texlive-bookhands"
DESCRIPTION = "This package includes the documentation for texlive-bookhands"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46480"

RPM_NAME = "texlive-bookhands-doc-2023.201.svn46480-52.1.noarch.rpm"
RPM_HASH = "14e031978cd283c82a52c48ec7f3014371b1c321b2f0d67b5b5e8e87f20ecd26e3a38fd10e7945ab39cdb44918e37fd981565330df2bc429ea9f0cf4d4b943f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookhands-doc"
RDEPENDS:${PN} += ""

inherit rpm
