SUMMARY = "Documentation for texlive-uml"
DESCRIPTION = "This package includes the documentation for texlive-uml"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn17476"

RPM_NAME = "texlive-uml-doc-2023.201.0.0.11svn17476-53.1.noarch.rpm"
RPM_HASH = "6f8e4d06819b105fdb77beff2c91fac96c4950fdae6d72df5ffda61b432e93a1aac657a3390ac02bdcc0079f1b9be9b07ea39513d7b744d97a9935be0e2a0da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uml-doc"
RDEPENDS:${PN} += ""

inherit rpm
