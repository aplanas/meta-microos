SUMMARY = "Py.test plugin to store test expectations and mark tests based on them"
DESCRIPTION = "A py.test plugin that stores test expectations by saving the set of \
failing tests, allowing them to be marked as xfail when running them \
in future. The tests expectations are stored such that they can be \
distributed alongside the tests. However, note that test expectations \
can only be reliably shared between Python 2 and Python 3 if they only \
use ASCII characters in their node ids: this likely isn’t a limitation \
if tests are using the normal Python format, as Python 2 only allows \
ASCII characters in identifiers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pytest-expect-1.1.0-4.1.noarch.rpm"
RPM_HASH = "22c3e896f8935479305ece30bfcefc835062cbbf5e82b7384eefe415accfd2ccb49800992e6fe89277a1b7259a2b94504274bd9554d3f8f0141553b4efbb4c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-expect) python39-pytest-expect python3dist(pytest-expect)"
RDEPENDS:${PN} += "python(abi) python39-pytest python39-six python39-u-msgpack-python"

inherit rpm
