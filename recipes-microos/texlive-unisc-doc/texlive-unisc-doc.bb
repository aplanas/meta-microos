SUMMARY = "Documentation for texlive-unisc"
DESCRIPTION = "This package includes the documentation for texlive-unisc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn63178"

RPM_NAME = "texlive-unisc-doc-2023.201.0.0.2svn63178-53.1.noarch.rpm"
RPM_HASH = "30552a30b7357b651ae16d21a2ef15e25ac8142bc98d63a757b96ad87981861df4728169cfae3c3d36a74122bc15bce1f9be5af0eab8451d7b50bafb0dcde4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisc-doc"
RDEPENDS:${PN} += ""

inherit rpm
