SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-pytest-order-0.10.0-1.10.noarch.rpm"
RPM_HASH = "b3cdb71adb7b99d07ebf79d66a18897c072d08de506f33bbf30ac12db6a785209e3b32962ce2de82fc34b58347d474b87c8663f1ba4d858ae7b59356a6eb8fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-order) python311-pytest-order python3dist(pytest-order)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
