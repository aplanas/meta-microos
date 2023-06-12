SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pytest-order-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a78b078806ae6051d9bcc5b1228f942ce5477875779388a83306b3534633c1b79af4399a6a5471768cd3b0f80067a54f6e1262d7685849c56088905e6ad12f3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-order python3.10dist(pytest-order) python310-pytest-order python3dist(pytest-order)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
