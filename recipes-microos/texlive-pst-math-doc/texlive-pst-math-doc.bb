SUMMARY = "Documentation for texlive-pst-math"
DESCRIPTION = "This package includes the documentation for texlive-pst-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.66svn64732"

RPM_NAME = "texlive-pst-math-doc-2023.201.0.0.66svn64732-52.1.noarch.rpm"
RPM_HASH = "b1ed353ca397242b8a4d8145a09b445773acf24771216d1234e9f30d07147b2f80e3f5db95beadafac4af0fade5d932b789ece2c95c0e2025f47fce181cb8a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
