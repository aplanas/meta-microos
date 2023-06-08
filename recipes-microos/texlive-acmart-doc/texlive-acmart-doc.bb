SUMMARY = "Documentation for texlive-acmart"
DESCRIPTION = "This package includes the documentation for texlive-acmart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.88svn64967"

RPM_NAME = "texlive-acmart-doc-2023.201.1.88svn64967-54.1.noarch.rpm"
RPM_HASH = "234d1b47b7175e801785788758751c8cf5a073208b4be32e2534661f826a90d646f4ebea4471dd6ded0da0f461b30d03c3ad4ddab7aa4d8175e4f850c87f4ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmart-doc"
RDEPENDS:${PN} += ""

inherit rpm
