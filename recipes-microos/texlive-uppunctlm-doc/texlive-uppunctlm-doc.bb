SUMMARY = "Documentation for texlive-uppunctlm"
DESCRIPTION = "This package includes the documentation for texlive-uppunctlm"
LICENSE = "LPPL-1.3c"

PV = "2023.201.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-doc-2023.201.0.0.1svn42334-53.1.noarch.rpm"
RPM_HASH = "9a9700b6b366e52b38e5874d0062b25535634da27b9622e79551dc4f7e936e0f44392c3fea879cdb461bc85e9baf564b1bbd8e25005a7e62ca682b46fd3fc781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uppunctlm-doc"
RDEPENDS:${PN} += ""

inherit rpm
