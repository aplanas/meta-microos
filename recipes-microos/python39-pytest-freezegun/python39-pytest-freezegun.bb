SUMMARY = "Fixtures in freeze_time"
DESCRIPTION = "Wrap tests with fixtures in freeze_time"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python39-pytest-freezegun-0.4.2-3.1.noarch.rpm"
RPM_HASH = "20c28769448b1991fa151b19ab7ebc21985813203a0db6e7e120983ea4e3ba3a41ff29bc928c0bef12e3a309e53bfb47a1876f6dbdad3777c31053a21ab033d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-freezegun) python39-pytest-freezegun python3dist(pytest-freezegun)"
RDEPENDS:${PN} += "python(abi) python39-freezegun python39-pytest"

inherit rpm
