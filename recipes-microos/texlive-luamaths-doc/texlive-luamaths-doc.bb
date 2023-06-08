SUMMARY = "Documentation for texlive-luamaths"
DESCRIPTION = "This package includes the documentation for texlive-luamaths"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65400"

RPM_NAME = "texlive-luamaths-doc-2023.201.1.0svn65400-52.1.noarch.rpm"
RPM_HASH = "cc85b093aafc66b75cf78b56c253cdda593f5fe4856eef18a834012f6fd47bd5c27d39cd8c858d74c861cf664e170b1b2fb93a4bb8bfc7fb131777742d4b0b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamaths-doc"
RDEPENDS:${PN} += ""

inherit rpm
