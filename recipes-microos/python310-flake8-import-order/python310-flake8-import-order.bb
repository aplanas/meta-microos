SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python310-flake8-import-order-0.18.2-1.4.noarch.rpm"
RPM_HASH = "5bcc9bc8dc43dd4c73f3204c06ec52fceeaf29fe8732d17206e22ec77aa8b3ed4580f6ba88740092becd721d0051cf7885350d7c8ba733a7fc2d837ae60fc804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-import-order python3.10dist(flake8-import-order) python310-flake8-import-order python3dist(flake8-import-order)"
RDEPENDS:${PN} += "python(abi) python310-flake8 python310-pycodestyle"

inherit rpm
