SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.13.4"

RPM_NAME = "python39-pytest-twisted-1.13.4-2.5.noarch.rpm"
RPM_HASH = "1e11ceb3831b92ba9baa34e0a4884b9c4615c5bb6a9056055109ba6ac61a79cce35f057dc69ff3cafd5d7572e8d298216d66d804b137281286dcc1bf6ba29a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-twisted) python39-pytest-twisted python3dist(pytest-twisted)"
RDEPENDS:${PN} += "python(abi) python39-Twisted python39-decorator python39-greenlet python39-pytest"

inherit rpm
