SUMMARY = "Documentation for texlive-acmconf"
DESCRIPTION = "This package includes the documentation for texlive-acmconf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-acmconf-doc-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "f61f9e073f4d990d87940ce5fdc8c82d0fa02a17194636abc27d4e0625172a5f897586a0e91298a64da10e8210150add52c57e3028706fe783ff70f5896bfb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmconf-doc"
RDEPENDS:${PN} += ""

inherit rpm
