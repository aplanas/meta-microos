SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python311-mkdocs-bootstrap-1.1-1.8.noarch.rpm"
RPM_HASH = "3742a0d49f36152fa2f62f9e3dd63c7e998d9ef9ce91d4787c261cb6ab3905a245618dcbca3e258a36976d11a9a0bffbf098bfbebb3735a1f6fdb44073aea202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mkdocs-bootstrap) python311-mkdocs-bootstrap python3dist(mkdocs-bootstrap)"
RDEPENDS:${PN} += "python(abi) python311-mkdocs"

inherit rpm
