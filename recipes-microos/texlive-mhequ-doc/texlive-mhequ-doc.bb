SUMMARY = "Documentation for texlive-mhequ"
DESCRIPTION = "This package includes the documentation for texlive-mhequ"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.72svn64978"

RPM_NAME = "texlive-mhequ-doc-2023.201.1.72svn64978-54.1.noarch.rpm"
RPM_HASH = "0bec8874b37bfe0168a51caacdaa08fa70717562dbf546c3e5484bcd03865f4d2d733fed1b0c20577302b6d69581e8968cda0a24a2cc5da4b0af8cf01d76e899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhequ-doc"
RDEPENDS:${PN} += ""

inherit rpm
