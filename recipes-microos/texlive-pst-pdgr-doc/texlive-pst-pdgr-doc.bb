SUMMARY = "Documentation for texlive-pst-pdgr"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdgr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-doc-2023.201.0.0.4svn45875-53.1.noarch.rpm"
RPM_HASH = "72b39f5a2f9025727467c2ba3320e1754c654a741451e510060424e963da4d88ab6c89e931936980018110de4237bac8a497ac69b9ea2f04d8a2414b0a3e61aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pdgr-doc"
RDEPENDS:${PN} += ""

inherit rpm
