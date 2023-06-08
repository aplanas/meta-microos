SUMMARY = "Documentation for texlive-bxbase"
DESCRIPTION = "This package includes the documentation for texlive-bxbase"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn66115"

RPM_NAME = "texlive-bxbase-doc-2023.201.1.2asvn66115-52.1.noarch.rpm"
RPM_HASH = "a68324d808d2699d9d56a22d178949c0e08871623e17528bbdfadbae864d780927f0931ce4da45b7eea4f1ceaf8a63056750e9f6b3b50fc1e35e7ff73ca457e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bxbase-doc:ja) texlive-bxbase-doc"
RDEPENDS:${PN} += ""

inherit rpm
