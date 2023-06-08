SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.11"

RPM_NAME = "python311-mkdocs-material-9.1.11-1.1.noarch.rpm"
RPM_HASH = "0d1458a93bd96c5f465239fca326a04ebee6112aac632f67b5ce59f69e213651d93cd49ffe80d2b3a566ceaae85b00cc1bb09af894405d142a4d964d977dd37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mkdocs-material) python311-mkdocs-material python3dist(mkdocs-material)"
RDEPENDS:${PN} += "python(abi) python311-Markdown python311-colorama python311-jinja2 python311-mkdocs python311-mkdocs-material-extensions python311-pygments python311-pymdown-extensions python311-regex python311-requests"

inherit rpm
