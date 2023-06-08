SUMMARY = "Documentation for texlive-bxtexlogo"
DESCRIPTION = "This package includes the documentation for texlive-bxtexlogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-doc-2023.201.0.0.6svn63231-52.1.noarch.rpm"
RPM_HASH = "ad5f43a1d5c77d99f631c44395cc326c06ed22816dafc843684a23d00f42a9581de0186a9ed7571350f1df8632aaea8d0a416dcf5c55b91bc3a5cd5379d0b61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxtexlogo-doc"
RDEPENDS:${PN} += ""

inherit rpm
