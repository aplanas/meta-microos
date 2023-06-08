SUMMARY = "Documentation for texlive-ku-template"
DESCRIPTION = "This package includes the documentation for texlive-ku-template"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-doc-2023.201.0.0.02svn45935-55.1.noarch.rpm"
RPM_HASH = "c4db83d6613c62a8ef76246bbbff26e54400856ff4dfbd1d9da10cc2e298c2ab43ac58833255d8820268e03452ddbdc8ff2a8cc40064032f8c1bbf80904f8df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ku-template-doc"
RDEPENDS:${PN} += ""

inherit rpm
