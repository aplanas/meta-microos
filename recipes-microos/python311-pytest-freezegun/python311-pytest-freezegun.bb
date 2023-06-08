SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python311-pytest-freezegun-0.4.2-2.1.noarch.rpm"
RPM_HASH = "abbf9475f5ef4b15a64082716d611a28f557d75a25eb9c974e88ba9a4160d4167f8baeed8bd85d72c1ed59e0f460d77419ee2d1ae6d97940f49ca3ea9720564a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-freezegun) python311-pytest-freezegun python3dist(pytest-freezegun)"
RDEPENDS:${PN} += "python(abi) python311-freezegun python311-pytest"

inherit rpm
