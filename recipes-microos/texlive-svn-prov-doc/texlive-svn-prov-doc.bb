SUMMARY = "Documentation for texlive-svn-prov"
DESCRIPTION = "This package includes the documentation for texlive-svn-prov"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1862svn64967"

RPM_NAME = "texlive-svn-prov-doc-2023.201.3.1862svn64967-57.1.noarch.rpm"
RPM_HASH = "381256a32f359f72666815e62cf2105ea5bff58300182c14254957ade1c2a6451be46641db8547c6877bf948b8b8d7a879be5ecec1455944b42974327af518db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-prov-doc"
RDEPENDS:${PN} += ""

inherit rpm
