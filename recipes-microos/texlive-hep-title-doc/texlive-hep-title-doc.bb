SUMMARY = "Documentation for texlive-hep-title"
DESCRIPTION = "This package includes the documentation for texlive-hep-title"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64907"

RPM_NAME = "texlive-hep-title-doc-2023.201.1.1svn64907-53.1.noarch.rpm"
RPM_HASH = "a4efa3ee45c1d4714f2d584ed43b908b8b75e8d3d4fbe0897e6eb5804449c5042b7f12a561aefdfa23a43ee4f77b99618d39806d8dc7bc97781dc1d50cc174f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-title-doc"
RDEPENDS:${PN} += ""

inherit rpm
