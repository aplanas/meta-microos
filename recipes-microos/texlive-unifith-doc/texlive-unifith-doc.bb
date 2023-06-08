SUMMARY = "Documentation for texlive-unifith"
DESCRIPTION = "This package includes the documentation for texlive-unifith"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn60698"

RPM_NAME = "texlive-unifith-doc-2023.201.1.6svn60698-53.1.noarch.rpm"
RPM_HASH = "27f194e7fa764cdcded6f3b1d96fe11588028afeb435f6b73c1b600c442887613058f1c3da7291cdbff9fbcf647391024d1269cb25d059990609593d840bb79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unifith-doc"
RDEPENDS:${PN} += ""

inherit rpm
