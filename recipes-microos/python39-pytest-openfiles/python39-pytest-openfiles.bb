SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pytest-openfiles-0.5.0-1.13.noarch.rpm"
RPM_HASH = "5308c7db1a362108a1c3a03891c2b50dfcf07367fb3829c90ca1e526e757b56dcfca0685b59ec3fc012ad9964b088b2e76f947822381cbc3dfb83ca0231b6016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-openfiles) python39-pytest-openfiles python3dist(pytest-openfiles)"
RDEPENDS:${PN} += "python(abi) python39-psutil python39-pytest"

inherit rpm
