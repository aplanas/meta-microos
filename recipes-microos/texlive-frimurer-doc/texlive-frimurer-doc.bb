SUMMARY = "Documentation for texlive-frimurer"
DESCRIPTION = "This package includes the documentation for texlive-frimurer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56704"

RPM_NAME = "texlive-frimurer-doc-2023.201.1svn56704-52.1.noarch.rpm"
RPM_HASH = "36e4ebf71af7fc6a8886b08c64b933120e54f9204b0a958ace477baf9ba342dba14efedecf7edb1aae3d6672040adf327c2310d297265a6e93cc8a6eccfd9444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frimurer-doc"
RDEPENDS:${PN} += ""

inherit rpm
