SUMMARY = "Documentation for texlive-trfsigns"
DESCRIPTION = "This package includes the documentation for texlive-trfsigns"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-trfsigns-doc-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "547deba7a671b9a8e644d83e9ad5736de6b5a8f540d8b813100b791f88f81997f85fd78e9052f192fbd6cefdc55be4b0dfdb293b0299de48cb7b62f6f5bcccc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-trfsigns-doc:de) texlive-trfsigns-doc"
RDEPENDS:${PN} += ""

inherit rpm
