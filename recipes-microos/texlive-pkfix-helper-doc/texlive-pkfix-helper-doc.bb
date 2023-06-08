SUMMARY = "Documentation for texlive-pkfix-helper"
DESCRIPTION = "This package includes the documentation for texlive-pkfix-helper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn56061"

RPM_NAME = "texlive-pkfix-helper-doc-2023.201.1.6svn56061-51.1.noarch.rpm"
RPM_HASH = "19d67a1f9e24b8f53159cf1e1bb7fa66692df61a9ab80864520b447ced95a8206d65b64937101387ebc0747e323d7f2c0f3bf9628d579efaaa8f1eac21f4bf00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pkfix-helper.1) texlive-pkfix-helper-doc"
RDEPENDS:${PN} += ""

inherit rpm
