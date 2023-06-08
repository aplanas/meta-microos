SUMMARY = "Documentation for texlive-eczar"
DESCRIPTION = "This package includes the documentation for texlive-eczar"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn57716"

RPM_NAME = "texlive-eczar-doc-2023.201.0.0.1svn57716-53.1.noarch.rpm"
RPM_HASH = "40fb6eddf12f19bf0c2c28b07c853befc8798c2842054b7b465b4b7a43fdabb8eb784aad0afcbd36936379a7ce0f21c50d8877448f864b519d890f96abe3c301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar-doc"
RDEPENDS:${PN} += ""

inherit rpm
