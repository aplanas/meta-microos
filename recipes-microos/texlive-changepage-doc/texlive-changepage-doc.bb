SUMMARY = "Documentation for texlive-changepage"
DESCRIPTION = "This package includes the documentation for texlive-changepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-changepage-doc-2023.201.1.0csvn15878-52.1.noarch.rpm"
RPM_HASH = "6a9afe5f88dd6550ab109c5fd16248d23c644c43c53a095f18b106eeae720728f818c470bb7a1807423d4a0d9ab2f934f4e220ee4a915444d11ed5593dbd6277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changepage-doc"
RDEPENDS:${PN} += ""

inherit rpm
