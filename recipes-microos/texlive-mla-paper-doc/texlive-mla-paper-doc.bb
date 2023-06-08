SUMMARY = "Documentation for texlive-mla-paper"
DESCRIPTION = "This package includes the documentation for texlive-mla-paper"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-mla-paper-doc-2023.201.svn54080-54.1.noarch.rpm"
RPM_HASH = "cec8749309297258572b298a290986aba836ea3889fb4fbd4b21fecb540e66d83b47d889b7cc365ad38ccd2d0e8043ddf69677b98a7d43dafae07550ae62531d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mla-paper-doc"
RDEPENDS:${PN} += ""

inherit rpm
