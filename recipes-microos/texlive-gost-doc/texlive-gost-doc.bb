SUMMARY = "Documentation for texlive-gost"
DESCRIPTION = "This package includes the documentation for texlive-gost"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2lsvn57616"

RPM_NAME = "texlive-gost-doc-2023.201.1.2lsvn57616-53.1.noarch.rpm"
RPM_HASH = "eb918c9c3b102424f3ca4759725283824c8d3e61a37ab7f5eb120be84fafbe2c61352c74b0935472761a158c35a359e88b6d75742b3da387346b0006ae5fe273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-gost-doc:en) \
texlive-gost-doc"
RDEPENDS:${PN} += ""

inherit rpm
