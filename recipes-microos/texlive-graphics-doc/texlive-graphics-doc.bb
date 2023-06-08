SUMMARY = "Documentation for texlive-graphics"
DESCRIPTION = "This package includes the documentation for texlive-graphics"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66204"

RPM_NAME = "texlive-graphics-doc-2023.201.svn66204-53.1.noarch.rpm"
RPM_HASH = "0c0a601178d7044d537915881b82effd8dd673383aef2a5e5b87ff948e411b8035c3b19f9dd2ccb82707ff30255ed2e478a6b4b418aaf0d89759421faff2f9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-doc"
RDEPENDS:${PN} += ""

inherit rpm
