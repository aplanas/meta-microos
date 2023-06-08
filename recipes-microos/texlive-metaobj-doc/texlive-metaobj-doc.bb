SUMMARY = "Documentation for texlive-metaobj"
DESCRIPTION = "This package includes the documentation for texlive-metaobj"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-doc-2023.201.0.0.93svn15878-54.1.noarch.rpm"
RPM_HASH = "f78587314767104cb6ee5731704a56b890ed8a3a8f62f0421e415fec486f0e50789df4184aedf9233db466ac97cb89264643e88b02aff5f82d746d3da83f26aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj-doc"
RDEPENDS:${PN} += ""

inherit rpm
