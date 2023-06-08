SUMMARY = "Documentation for texlive-version"
DESCRIPTION = "This package includes the documentation for texlive-version"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn21920"

RPM_NAME = "texlive-version-doc-2023.201.2.0svn21920-53.1.noarch.rpm"
RPM_HASH = "13bb27d4a827cb06880c26592ae5fff7ab43b764e6c9965b3bfca8f841b82f816f74363fb617e90efb4d3a651b7c14586a8ce0e843bfd45daa9efdf6e4703a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-version-doc"
RDEPENDS:${PN} += ""

inherit rpm
