SUMMARY = "Documentation for texlive-phonrule"
DESCRIPTION = "This package includes the documentation for texlive-phonrule"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-doc-2023.201.1.3.2svn43963-51.1.noarch.rpm"
RPM_HASH = "0789c7babd67ea07a2b93a35078a7b477a3b101bd093a959eddfa2163a53b69ca58b55cc108b710cf60160bd441c07bedc74e666347eb348442382c47cadc1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonrule-doc"
RDEPENDS:${PN} += ""

inherit rpm
