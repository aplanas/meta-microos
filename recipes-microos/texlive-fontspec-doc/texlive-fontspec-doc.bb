SUMMARY = "Documentation for texlive-fontspec"
DESCRIPTION = "This package includes the documentation for texlive-fontspec"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.8asvn63386"

RPM_NAME = "texlive-fontspec-doc-2023.201.2.8asvn63386-52.1.noarch.rpm"
RPM_HASH = "17ec72a90d3ad6cc47ff4d6bacb7d9e0108d204a8891a582a051298c2b45b96e800da9fe53c9c41f5ebf2001f33d6937d029232c0f0fbbd93c0ce09e70c7e8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontspec-doc"
RDEPENDS:${PN} += ""

inherit rpm
