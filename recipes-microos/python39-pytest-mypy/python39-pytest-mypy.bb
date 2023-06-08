SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python39-pytest-mypy-0.10.3-1.3.noarch.rpm"
RPM_HASH = "38aaaa61b71cd5daa9131d6eb8bb1aa9a2ef2b8f99e2cb22659e274275a89461257f410beb4868336bdfc95db89714c727c37f73ea54922f853e515e6afeea91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-mypy) python39-pytest-mypy python3dist(pytest-mypy)"
RDEPENDS:${PN} += "python(abi) python39-attrs python39-filelock python39-mypy python39-pytest"

inherit rpm
