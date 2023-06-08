SUMMARY = "Documentation for texlive-pst-marble"
DESCRIPTION = "This package includes the documentation for texlive-pst-marble"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn50925"

RPM_NAME = "texlive-pst-marble-doc-2023.201.1.6svn50925-52.1.noarch.rpm"
RPM_HASH = "a3cf64182062bacbef02bbdcfde5096b6bcee0b63ace30f62ce6c370f350910550cd46a55f486c81e0c1a1229d4fa4ec8ca60b6d5fd3437cb947f6f288618312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-marble-doc"
RDEPENDS:${PN} += ""

inherit rpm
