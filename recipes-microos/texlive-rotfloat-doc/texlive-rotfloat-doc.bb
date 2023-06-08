SUMMARY = "Documentation for texlive-rotfloat"
DESCRIPTION = "This package includes the documentation for texlive-rotfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18292"

RPM_NAME = "texlive-rotfloat-doc-2023.201.1.2svn18292-53.1.noarch.rpm"
RPM_HASH = "2a28f1c3d75925a880fe8040e94b54175958ff53dad34672ac78c34e1660a7f8050857df5c4ba0861071c70ef0e494de837c94d168cb645e450555ae0fd9320b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
