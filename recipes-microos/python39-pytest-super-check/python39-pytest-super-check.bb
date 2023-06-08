SUMMARY = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc"
DESCRIPTION = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pytest-super-check-2.1.0-1.17.noarch.rpm"
RPM_HASH = "06e82c1940bbfabd2bcf23de130b3cd0a66e3de1ce598d1fe2465a8a15cc094b18a6d973b721f71e34dcbb5c0433891f6149685e77ade09c66662c24cc4ab282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-super-check) python39-pytest-super-check python3dist(pytest-super-check)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
