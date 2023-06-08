SUMMARY = "Pytest plugin for checking links in files"
DESCRIPTION = "A pytest plugin that checks URLs for HTML-containing files."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-pytest-check-links-0.8.0-1.1.noarch.rpm"
RPM_HASH = "1a9a09ec3631790f36e7206926b63456631f2bbc664362e6e6d8c2bf121f7a15b87b71ee96bee5ee6b1fa842744061eb9f33c901bef6590d081813bf0a283437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check-links python3.10dist(pytest-check-links) python310-pytest-check-links python3dist(pytest-check-links)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-docutils python310-html5lib python310-pytest python310-requests update-alternatives"

inherit rpm
