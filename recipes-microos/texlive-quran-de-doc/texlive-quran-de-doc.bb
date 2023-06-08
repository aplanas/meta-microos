SUMMARY = "Documentation for texlive-quran-de"
DESCRIPTION = "This package includes the documentation for texlive-quran-de"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-doc-2023.201.0.0.2svn54191-53.1.noarch.rpm"
RPM_HASH = "2235e0bb1de0a7db03be616f01adee1537c02c095085fedadd770146b1b24ec1fec7e2daa103c309dc8dbdf409802720ee148f26e0b0dec9955ddbf9fcc746b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-de-doc"
RDEPENDS:${PN} += ""

inherit rpm
