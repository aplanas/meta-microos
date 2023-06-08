SUMMARY = "Documentation for texlive-quantikz"
DESCRIPTION = "This package includes the documentation for texlive-quantikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-doc-2023.201.0.0.9.6svn54911-53.1.noarch.rpm"
RPM_HASH = "908f6ebe146abbef73f3407657fbd8a28cbaa46d55d4e74bb8374b686056f20da143f02c6f14d8025a1223d025ee2595e4902f4683a74ddd0fe0c7cbd98ab3d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
