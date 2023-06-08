SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python311-sphinxcontrib-jquery-4.1-1.1.noarch.rpm"
RPM_HASH = "4b96cd7007b119148873964664d8ac5e2488ba5facd587c2316aa8c413ae947c5d4a8f8f7a371131b3b7860b9be20b58343e0c62558e4efdd63ec0dbda38fab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-jquery) python311-sphinxcontrib-jquery python3dist(sphinxcontrib-jquery)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
