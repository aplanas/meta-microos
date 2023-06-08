SUMMARY = "Documentation for texlive-skdoc"
DESCRIPTION = "This package includes the documentation for texlive-skdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5dsvn56950"

RPM_NAME = "texlive-skdoc-doc-2023.201.1.5dsvn56950-57.1.noarch.rpm"
RPM_HASH = "dcaacb1e872b4546f3ec006e57a37100ce04d5ad7ed263341c4756692308a67b0b3d72c90f4c66ea960dd9c06d1e6500bae7ccf81423eb00521e540f5c4e18df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skdoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
