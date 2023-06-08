SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pytest-toolbox-0.4-3.3.noarch.rpm"
RPM_HASH = "3f8b9ce20ee7c9a14f01b449feade3739edc319571550af05edbf32dfdbb3a9bf919059f0a507d019a3e4b163754cedba0bb2beb4af7e4b6431a1853136c3314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-toolbox) python311-pytest-toolbox python3dist(pytest-toolbox)"
RDEPENDS:${PN} += "python(abi) python311-py python311-pytest"

inherit rpm
