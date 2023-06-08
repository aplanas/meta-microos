SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-pytest-order-0.10.0-1.10.noarch.rpm"
RPM_HASH = "ca248d69a9acb5d44a9faacd575a75452df34d10b189409d89385154b003b1a7e0abad55756cef039ce486470c07d6189304089c610155a353a9b7de0892f2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-order python3.10dist(pytest-order) python310-pytest-order python3dist(pytest-order)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
