SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python310-sphinxcontrib-applehelp-1.0.4-2.1.noarch.rpm"
RPM_HASH = "f62ebcc7d5d9a6a07db4a6b99565b9d45eb010c9f616ea47779db2de16d927b57e2feea739d15d4f22844107bc925ab62b1344adf3d81019cfe9c1e06a3d0997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-applehelp python3.10dist(sphinxcontrib-applehelp) python310-sphinxcontrib-applehelp python3dist(sphinxcontrib-applehelp)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
