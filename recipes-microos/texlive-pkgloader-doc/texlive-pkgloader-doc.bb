SUMMARY = "Documentation for texlive-pkgloader"
DESCRIPTION = "This package includes the documentation for texlive-pkgloader"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn47486"

RPM_NAME = "texlive-pkgloader-doc-2023.201.0.0.7.0svn47486-51.1.noarch.rpm"
RPM_HASH = "5a749a5d6cc9584f72041e3508b469ade5157d6ce1aaec613d42716dd6b2fd1508f453cddfb44a3cbfa4d6735d5985967243395e79cf46831e0c06c1651d41b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkgloader-doc"
RDEPENDS:${PN} += ""

inherit rpm
