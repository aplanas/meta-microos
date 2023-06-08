SUMMARY = "Documentation for texlive-ec"
DESCRIPTION = "This package includes the documentation for texlive-ec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25033"

RPM_NAME = "texlive-ec-doc-2023.201.1.0svn25033-53.1.noarch.rpm"
RPM_HASH = "f3e77a17215f1e61d905da5120bc0221017cee8d2c47dbfa3beafb93507fa3f1f237a7f6bee1d3045b30250171c522ef5ec3e95053ec1aeb54fd23ae97f2f427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ec-doc"
RDEPENDS:${PN} += ""

inherit rpm
