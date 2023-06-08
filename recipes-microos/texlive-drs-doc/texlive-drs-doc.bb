SUMMARY = "Documentation for texlive-drs"
DESCRIPTION = "This package includes the documentation for texlive-drs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn19232"

RPM_NAME = "texlive-drs-doc-2023.201.1.1bsvn19232-52.1.noarch.rpm"
RPM_HASH = "c58071ff991b5b7ea0bb7e9019ef64217dfb7e16f86d1eec43762bfece6d2dd15e0c4c5204f8d488b3e8da9067ec11300003832c1dea6f0f32c08571dde5ff86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drs-doc"
RDEPENDS:${PN} += ""

inherit rpm
