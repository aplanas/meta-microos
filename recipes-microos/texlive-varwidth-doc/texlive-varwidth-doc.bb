SUMMARY = "Documentation for texlive-varwidth"
DESCRIPTION = "This package includes the documentation for texlive-varwidth"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn24104"

RPM_NAME = "texlive-varwidth-doc-2023.201.0.0.92svn24104-53.1.noarch.rpm"
RPM_HASH = "5ceaee1593873d162adfbc080ce0c45029a1ed3b24040be5da9b65bedf943522b3c909e653f89db66058ae0a5e8a6a1e74b5f7456c623ffaad98cbdcfdb9ef6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varwidth-doc"
RDEPENDS:${PN} += ""

inherit rpm
