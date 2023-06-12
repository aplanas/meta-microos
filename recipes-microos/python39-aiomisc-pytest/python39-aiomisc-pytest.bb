SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-aiomisc-pytest-1.1.1-1.1.noarch.rpm"
RPM_HASH = "9eaaa833655ce32f800aa0a3bee4cf9fa04ad5e9d9dd196502b9035215cbe45cadbda974c5af3f7931ff0c1a4c15634ee08fa7d50e3c04a70cfb94ba857b165f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiomisc-pytest) python39-aiomisc-pytest python3dist(aiomisc-pytest)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
