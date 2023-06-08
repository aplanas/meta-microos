SUMMARY = "Documentation for texlive-xcite"
DESCRIPTION = "This package includes the documentation for texlive-xcite"
LICENSE = "LPPL-1.0"

PV = "2023.201.16383.99998svn53486"

RPM_NAME = "texlive-xcite-doc-2023.201.16383.99998svn53486-52.1.noarch.rpm"
RPM_HASH = "33da468cc3f2985824b5218ebc394a7d237cc77b35b3a5cf69f7454225029f8cf85d04bbde65c2609696f352a4106941797fa2c2af9c6f6503f170ba1d9c8136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcite-doc"
RDEPENDS:${PN} += ""

inherit rpm
