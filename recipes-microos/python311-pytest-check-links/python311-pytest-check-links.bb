SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python311-pytest-check-links-0.8.0-1.1.noarch.rpm"
RPM_HASH = "cd3b4cd6a4f36c1367175e647f275e0f6bfcec04b3897c963affff1f3c5da7d6845ea2be2c9f6e5e003842a05d6ab98b17e7d65de45dd95db77541cd474c9118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-check-links) python311-pytest-check-links python3dist(pytest-check-links)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-docutils python311-html5lib python311-pytest python311-requests update-alternatives"

inherit rpm
