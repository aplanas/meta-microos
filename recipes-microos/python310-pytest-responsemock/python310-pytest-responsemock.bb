SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-pytest-responsemock-1.1.1-1.5.noarch.rpm"
RPM_HASH = "7531917fc23a15560a6fb4a88fc50c72a00f72d619ec3b83600e5666a783a78cc27aa04aa35217f8139dede3a85076d04fea7b6ac39dcce5c956c5d98988e445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-responsemock \
python3.10dist(pytest-responsemock) \
python310-pytest-responsemock \
python3dist(pytest-responsemock)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-responses"

inherit rpm
