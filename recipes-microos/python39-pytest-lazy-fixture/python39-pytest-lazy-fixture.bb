SUMMARY = "Helper to use fixtures in pytest.markparametrize"
DESCRIPTION = "Helper to use fixtures in pytest.mark.parametrize."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python39-pytest-lazy-fixture-0.6.3-2.1.noarch.rpm"
RPM_HASH = "c083f0e44d14f77e9889fa7d7b475bafdebe0d8077c68257864526af1aaebbe6ec2e438088cf83be797a01fde09617a67fe911e0ae3418c9185929a4bd2c111a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-lazy-fixture) python39-pytest-lazy-fixture python3dist(pytest-lazy-fixture)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
