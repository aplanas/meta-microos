SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python39-pytest-freezegun-0.4.2-2.1.noarch.rpm"
RPM_HASH = "8deaafc1366c02a04c7327525fb6c08582aea4bbcdda3faccd01ac47a47213813efb1fa7394f06c68e29b9acedd3fc63cda02c28759e661970d56ec2ebc9172d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-freezegun) python39-pytest-freezegun python3dist(pytest-freezegun)"
RDEPENDS:${PN} += "python(abi) python39-freezegun python39-pytest"

inherit rpm
