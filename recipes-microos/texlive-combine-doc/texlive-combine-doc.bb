SUMMARY = "Documentation for texlive-combine"
DESCRIPTION = "This package includes the documentation for texlive-combine"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn19361"

RPM_NAME = "texlive-combine-doc-2023.201.0.0.7asvn19361-53.1.noarch.rpm"
RPM_HASH = "786ba51d6077159505ed51ef8a5a76be7e614d01ecb46c34f95daadcaf6b1ab94d066d52db4f2acad3c8ceb49b2e4e508e5085e68edd289d17b8e59a4eacafb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combine-doc"
RDEPENDS:${PN} += ""

inherit rpm
