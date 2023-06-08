SUMMARY = "Documentation for texlive-psbao"
DESCRIPTION = "This package includes the documentation for texlive-psbao"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55013"

RPM_NAME = "texlive-psbao-doc-2023.201.1.0svn55013-52.1.noarch.rpm"
RPM_HASH = "6831200bddc028b1e6f0d4dcbb8a13e899f37c23f6085211e558a3013a57ca2aa47b6a024f3235fd7f0df70067655e2bb3167afd719849d165a83efd272fc251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psbao-doc"
RDEPENDS:${PN} += ""

inherit rpm
