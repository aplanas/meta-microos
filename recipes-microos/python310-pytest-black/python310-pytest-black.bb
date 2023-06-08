SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python310-pytest-black-0.3.12-2.10.noarch.rpm"
RPM_HASH = "12a3484e10f893855db2694e18a48d960dfc9d6dcc7b1f0653f01181f5f055722467483644238be037c4cd4ed829f39808c27a463a63cb8be71ad09707cfe72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-black python3.10dist(pytest-black) python310-pytest-black python3dist(pytest-black)"
RDEPENDS:${PN} += "python(abi) python310-black python310-pytest python310-toml"

inherit rpm
