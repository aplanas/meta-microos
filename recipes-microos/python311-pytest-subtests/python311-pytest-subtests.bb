SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-pytest-subtests-0.10.0-2.1.noarch.rpm"
RPM_HASH = "0ab450cc0e26ef1f7eedde701d0fcc8d304149a07da3d65e0ad3b785e4de17ddc71d24e82143558a652e5b590f3f0b58c28e80942caf9ab585440b92f9a4a19d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-subtests) python311-pytest-subtests python3dist(pytest-subtests)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
