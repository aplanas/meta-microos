SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-pytest-check-links-0.8.0-1.1.noarch.rpm"
RPM_HASH = "96b58d20ad9ec059698995cd2d9c39c3c00eea5bafa948f2054c400ef0ac02a779e4c5ef01977cfeec0050114d55ebfc50ca00aadb93cd6d0f90028c078bce58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-check-links) python39-pytest-check-links python3dist(pytest-check-links)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-docutils python39-html5lib python39-pytest python39-requests update-alternatives"

inherit rpm
