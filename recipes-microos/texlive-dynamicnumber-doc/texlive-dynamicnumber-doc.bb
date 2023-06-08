SUMMARY = "Documentation for texlive-dynamicnumber"
DESCRIPTION = "This package includes the documentation for texlive-dynamicnumber"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-doc-2023.201.0.0.1.3svn38726-53.1.noarch.rpm"
RPM_HASH = "a2c742be92e5e270f84f30a29072fbb261cf96ba5a6d8920d5ddafa8f92ba4125c6b063aeca4e4c2738e0359fb933b74b394919d1b8d999c3c653f7443c8841c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynamicnumber-doc"
RDEPENDS:${PN} += ""

inherit rpm
