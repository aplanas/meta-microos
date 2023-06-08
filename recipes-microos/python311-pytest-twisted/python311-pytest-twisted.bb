SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.13.4"

RPM_NAME = "python311-pytest-twisted-1.13.4-2.5.noarch.rpm"
RPM_HASH = "fd7f6bbf2ad9f119ba64fd73155b44ceaf827d1e486518b35389a24f94df87ec3732e4f492e386de110af43b58574860cbc429fcee65fd3606a7c073e84b41af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-twisted) python311-pytest-twisted python3dist(pytest-twisted)"
RDEPENDS:${PN} += "python(abi) python311-Twisted python311-decorator python311-greenlet python311-pytest"

inherit rpm
