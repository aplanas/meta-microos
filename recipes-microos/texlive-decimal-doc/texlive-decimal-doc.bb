SUMMARY = "Documentation for texlive-decimal"
DESCRIPTION = "This package includes the documentation for texlive-decimal"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23374"

RPM_NAME = "texlive-decimal-doc-2023.201.svn23374-52.1.noarch.rpm"
RPM_HASH = "0b4138f67c2ab530ce3f3a13152c9e1e4e7715070808df47d082b03c355efff34ee6560c0a392cdf9109a4f61eaa80042eb96f164441b16b3d36f4ab61bc3640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decimal-doc"
RDEPENDS:${PN} += ""

inherit rpm
