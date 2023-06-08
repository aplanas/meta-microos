SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python39-pytest-black-0.3.12-2.10.noarch.rpm"
RPM_HASH = "488abb474b4dcf17a8e6ecab7106adbbf354d9e0f03ad1d17144c24578a335f358f95e6896d57d34a217842882c60f48f7336c85efab5b88f9f5518aca4a55c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-black) python39-pytest-black python3dist(pytest-black)"
RDEPENDS:${PN} += "python(abi) python39-black python39-pytest python39-toml"

inherit rpm
