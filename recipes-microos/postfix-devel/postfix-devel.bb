SUMMARY = "Development headers for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-devel-3.8.0-2.1.noarch.rpm"
RPM_HASH = "c5dd8f60e324291a9cf928ad17573148c669a459aaac129963e7a92f974c72772f121b288e8907e35f537708a9e7a0ca8fcbf6a1dd9661f5d8794ba84299beb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-devel"
RDEPENDS:${PN} += "postfix"

inherit rpm
