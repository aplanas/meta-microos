SUMMARY = "Documentation for texlive-cmsd"
DESCRIPTION = "This package includes the documentation for texlive-cmsd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18787"

RPM_NAME = "texlive-cmsd-doc-2023.201.svn18787-53.1.noarch.rpm"
RPM_HASH = "438850062f124e336e4096a8f3598d2ad5850c4df4c9d592f37685cea47344afa53212d917a721233abee4b965c346e399cd4ec8e3c4c33c12fe9850783020de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmsd-doc"
RDEPENDS:${PN} += ""

inherit rpm
