SUMMARY = "Documentation for texlive-greek-inputenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-inputenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-doc-2023.201.1.8.2svn66296-53.1.noarch.rpm"
RPM_HASH = "f4382845a3c7929887bce90c172cfef7b7ba2968b32f737de521666e346cf220858dfadfb2a9790edb9a85bb65e14b75dbc0f66e4f2a089aa20efe6620966663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-inputenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
