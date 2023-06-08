SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-pytest-subtests-0.10.0-2.1.noarch.rpm"
RPM_HASH = "829dae28fe71dc167275a7575dc6d5ceb95ea4aebfd166cd49ac776fdb67fbcbf915be8d946c28d649958dfac3dde4b34f7caa9013d2f3fdf05cbe7852b523aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-subtests) python39-pytest-subtests python3dist(pytest-subtests)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
