SUMMARY = "Documentation for texlive-pst-magneticfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-magneticfield"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn63821"

RPM_NAME = "texlive-pst-magneticfield-doc-2023.201.1.17svn63821-52.1.noarch.rpm"
RPM_HASH = "80177686bdced99a26f0c85e7ba106d2073f6169e5f8e6baf2c65702ca1be6fbad8ac62767949d91094d5885fbb0904c7c2e632a710eb3a80d238be6f1dabf23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-magneticfield-doc"
RDEPENDS:${PN} += ""

inherit rpm
