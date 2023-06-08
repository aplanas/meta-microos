SUMMARY = "Documentation for texlive-arvo"
DESCRIPTION = "This package includes the documentation for texlive-arvo"
LICENSE = "OFL-1.1"

PV = "2023.201.svn57213"

RPM_NAME = "texlive-arvo-doc-2023.201.svn57213-53.1.noarch.rpm"
RPM_HASH = "fda6c6cd6cb3cb95104fa11154863d12d88baa5ac6a54d65143bb3584ab853bd5bb30c27b5b1af69a6b36fe11900391a1b0f529122140d1afe58ac841dfd58f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arvo-doc"
RDEPENDS:${PN} += ""

inherit rpm
