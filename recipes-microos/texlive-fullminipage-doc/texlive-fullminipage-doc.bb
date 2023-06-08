SUMMARY = "Documentation for texlive-fullminipage"
DESCRIPTION = "This package includes the documentation for texlive-fullminipage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-doc-2023.201.0.0.1.1svn34545-52.1.noarch.rpm"
RPM_HASH = "d3662a887856d727652fbfcc7ad77dadc6a7f632a8a7fe4d12f0ed5c43d2953e7951b45bba440c3612a69197511572a3b296b159649bce49a41796e3a7fe87cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullminipage-doc"
RDEPENDS:${PN} += ""

inherit rpm
