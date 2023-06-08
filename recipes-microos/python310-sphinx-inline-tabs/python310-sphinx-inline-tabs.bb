SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2022.1.2b11"

RPM_NAME = "python310-sphinx-inline-tabs-2022.1.2b11-1.3.noarch.rpm"
RPM_HASH = "1f2db64aa29e2806bd58bf54f8dfa3ec1cdbc294143a63f549f13f43dd223f92ee51351767af190222128efe5b132d0375e1e2c40022206a9ec31877f78e65c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-inline-tabs python3.10dist(sphinx-inline-tabs) python310-sphinx-inline-tabs python3dist(sphinx-inline-tabs)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
