SUMMARY = "Documentation for texlive-scalerel"
DESCRIPTION = "This package includes the documentation for texlive-scalerel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn42809"

RPM_NAME = "texlive-scalerel-doc-2023.201.1.8svn42809-53.1.noarch.rpm"
RPM_HASH = "12a4613d32cbbd9b3a0d9ebb241fca247c6c6923fb02f3a0acb9899b92e77c1c4167659e3bc2ceb7a7376444f890792923cca08165cc3b8958c1a3d0b6920e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalerel-doc"
RDEPENDS:${PN} += ""

inherit rpm
