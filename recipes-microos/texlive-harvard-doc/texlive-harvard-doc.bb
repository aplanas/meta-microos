SUMMARY = "Documentation for texlive-harvard"
DESCRIPTION = "This package includes the documentation for texlive-harvard"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.5svn15878"

RPM_NAME = "texlive-harvard-doc-2023.201.2.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "7e5e541133d76983c707dd3e56f7e2a6b0ee348dfb6f3899c5f416e19fbb7ec96aa763e93c8d06f866183f77dabfcdce54cc0c559aeef35121cded6e0a794f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvard-doc"
RDEPENDS:${PN} += ""

inherit rpm
