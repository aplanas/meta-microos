SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-pytest-order-0.10.0-1.10.noarch.rpm"
RPM_HASH = "b774252af39eed4ab0cc37c43d6a633d092f2ddbd627a4d0472d85c4777f268b49e1bdae4348a2b86efc9efcaece9fe5d832428ddd6fc4e6fea8b12136f5adb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-order) python39-pytest-order python3dist(pytest-order)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
