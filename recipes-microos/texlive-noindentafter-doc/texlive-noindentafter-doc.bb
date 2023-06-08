SUMMARY = "Documentation for texlive-noindentafter"
DESCRIPTION = "This package includes the documentation for texlive-noindentafter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn59195"

RPM_NAME = "texlive-noindentafter-doc-2023.201.1.00svn59195-54.1.noarch.rpm"
RPM_HASH = "4f654e4d29a4399887916f5f0c84b901e7aa8bfa6ea1104ff299aa6b488dfef57b9748f27f569d80bf0b393ad6a382f87885ac94f3d24d02bb69b47d8dabaa50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noindentafter-doc"
RDEPENDS:${PN} += ""

inherit rpm
