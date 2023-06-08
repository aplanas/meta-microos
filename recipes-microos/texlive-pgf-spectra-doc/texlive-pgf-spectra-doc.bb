SUMMARY = "Documentation for texlive-pgf-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pgf-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.0svn66011"

RPM_NAME = "texlive-pgf-spectra-doc-2023.201.2.2.0svn66011-51.1.noarch.rpm"
RPM_HASH = "d0840e1f53c7ea8c823dd6092fdffafaf3d850d06188ac6fdc48d32d5639600b2e0930c9116da6dad14eb2bf7f000474b3c66a0a1bfd2e69c47ef867b81ee0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-spectra-doc"
RDEPENDS:${PN} += ""

inherit rpm
