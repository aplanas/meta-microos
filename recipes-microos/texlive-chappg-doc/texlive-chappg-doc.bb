SUMMARY = "Documentation for texlive-chappg"
DESCRIPTION = "This package includes the documentation for texlive-chappg"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1bsvn15878"

RPM_NAME = "texlive-chappg-doc-2023.201.2.1bsvn15878-52.1.noarch.rpm"
RPM_HASH = "4b8670ce815142483a7f941df1c2aea6aa2d1590a8827ef03b127441800093eea747ed456e97bf9cc7818b4deabc2b00d1ca2d559051d1ef527c025543a1c630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chappg-doc"
RDEPENDS:${PN} += ""

inherit rpm
