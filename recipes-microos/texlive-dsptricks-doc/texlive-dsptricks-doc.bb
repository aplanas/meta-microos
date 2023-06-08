SUMMARY = "Documentation for texlive-dsptricks"
DESCRIPTION = "This package includes the documentation for texlive-dsptricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34724"

RPM_NAME = "texlive-dsptricks-doc-2023.201.1.0svn34724-52.1.noarch.rpm"
RPM_HASH = "300064ca16de76846f361cf74f67eeb13f1857e542548ed71cd64db5296f0b22ed21628c0cac1757994522ec5250a0164acb00f5a616320fd579ef32b267211f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsptricks-doc"
RDEPENDS:${PN} += ""

inherit rpm
