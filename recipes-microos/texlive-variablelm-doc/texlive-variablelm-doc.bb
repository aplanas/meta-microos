SUMMARY = "Documentation for texlive-variablelm"
DESCRIPTION = "This package includes the documentation for texlive-variablelm"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.2svn60014"

RPM_NAME = "texlive-variablelm-doc-2023.201.1.2svn60014-53.1.noarch.rpm"
RPM_HASH = "7d55cf3dd5acfb8d5cd755b68bbec150d2da8690a8076636d8877e34f99a776e1fb13a5ee87be728032a3e5f1aca41e0f12290ca6b59193666e3b2c8828fac6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-variablelm-doc"
RDEPENDS:${PN} += ""

inherit rpm
