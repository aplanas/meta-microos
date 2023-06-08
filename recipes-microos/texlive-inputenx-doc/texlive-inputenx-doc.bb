SUMMARY = "Documentation for texlive-inputenx"
DESCRIPTION = "This package includes the documentation for texlive-inputenx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn52986"

RPM_NAME = "texlive-inputenx-doc-2023.201.1.12svn52986-52.1.noarch.rpm"
RPM_HASH = "a3cea674c73f52d38e9447ae4bd7c6037eaca74c4241a19456806d9d17e7a5ad0242f7a8a0c9ab669a661c1486dc26157d58ed52f3a69d24eb7ed739d7f20f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputenx-doc"
RDEPENDS:${PN} += ""

inherit rpm
