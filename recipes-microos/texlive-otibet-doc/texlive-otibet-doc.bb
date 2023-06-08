SUMMARY = "Documentation for texlive-otibet"
DESCRIPTION = "This package includes the documentation for texlive-otibet"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45777"

RPM_NAME = "texlive-otibet-doc-2023.201.svn45777-54.1.noarch.rpm"
RPM_HASH = "4ef2b7d7aa7225abb1a530ec4c6755830ba59ac11d65e815a646ddd56b1829d8040196af563d1c3e58f7ddec617007e4efd95a021c9bb4d96e9ac8772413f9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-otibet-doc"
RDEPENDS:${PN} += ""

inherit rpm
