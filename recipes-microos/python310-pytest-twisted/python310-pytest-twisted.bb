SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.13.4"

RPM_NAME = "python310-pytest-twisted-1.13.4-2.5.noarch.rpm"
RPM_HASH = "13911888f49723a4122c23a4cdce2e13081e454b8fb534eacd01e9a6b40c8273914e0cdba752d5004c518f9d4fa970e36d42604b84c449a89db689e579d7745f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-twisted python3.10dist(pytest-twisted) python310-pytest-twisted python3dist(pytest-twisted)"
RDEPENDS:${PN} += "python(abi) python310-Twisted python310-decorator python310-greenlet python310-pytest"

inherit rpm
