SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python310-pytest-freezegun-0.4.2-2.1.noarch.rpm"
RPM_HASH = "72c5f4e433b78594c2d47404e8c04db603e7bf6eca3200fad802b646bd49642199f4223d6860fb1a3d59318c554470dd52c0f4c9b73c13d34d3d47f4a2504803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-freezegun python3.10dist(pytest-freezegun) python310-pytest-freezegun python3dist(pytest-freezegun)"
RDEPENDS:${PN} += "python(abi) python310-freezegun python310-pytest"

inherit rpm
