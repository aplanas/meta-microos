SUMMARY = "Documentation for texlive-proba"
DESCRIPTION = "This package includes the documentation for texlive-proba"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-proba-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "fe77a65fa7c56982398bb526acdd0a6d8f34e6347de5cd1be1e0513b692cd1e2cb404d9b190e239e48b80e548874486d225f6fd2a32b36997f36d70dd043d3d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proba-doc"
RDEPENDS:${PN} += ""

inherit rpm
