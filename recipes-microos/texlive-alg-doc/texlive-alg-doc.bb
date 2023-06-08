SUMMARY = "Documentation for texlive-alg"
DESCRIPTION = "This package includes the documentation for texlive-alg"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-alg-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "a296c7935e908b6d8cc4154d6cf1d92024026553afaea97b004b6c652c4a1b74c21f95f2fbe28bc8684463c98b4bcf04974d9449db52e70b781e7618d5f1f394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alg-doc"
RDEPENDS:${PN} += ""

inherit rpm
