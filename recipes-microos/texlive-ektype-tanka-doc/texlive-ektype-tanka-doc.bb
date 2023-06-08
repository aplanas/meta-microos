SUMMARY = "Documentation for texlive-ektype-tanka"
DESCRIPTION = "This package includes the documentation for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-doc-2023.201.0.0.2svn63255-53.1.noarch.rpm"
RPM_HASH = "8ac051ba88a566491446e3c9dc04d85bc18abf0c398c03e18c1061af6c22e11282dde1d7654f1d7d6b11c33769bb23054d7041ee9f04a00697ebe15db6d9da7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hi) locale(texlive-ektype-tanka-doc:mr texlive-ektype-tanka-doc"
RDEPENDS:${PN} += ""

inherit rpm
