SUMMARY = "Documentation for texlive-faktor"
DESCRIPTION = "This package includes the documentation for texlive-faktor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn15878"

RPM_NAME = "texlive-faktor-doc-2023.201.0.0.1bsvn15878-52.1.noarch.rpm"
RPM_HASH = "f03e8d2e0f4bcc45637870c966cd40790ef8f5068c2e436ac07a0ff6c86ca781aa80657520efd71b5d9a6008eec7773c1ad2ee72be72e851493e2138d52d7649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-faktor-doc:de) texlive-faktor-doc"
RDEPENDS:${PN} += ""

inherit rpm
