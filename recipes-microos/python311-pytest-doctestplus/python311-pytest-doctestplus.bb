SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-pytest-doctestplus-0.12.1-1.1.noarch.rpm"
RPM_HASH = "13aa2e1d34537e05464542b38218dee3c8dc3f50f2a14a85748d4da814dd584ac18ea443039e4493e39517c606f995a2529d119ff2402e90c75f0b39c684ca6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-doctestplus) python311-pytest-doctestplus python3dist(pytest-doctestplus)"
RDEPENDS:${PN} += "python(abi) python311-packaging python311-pytest python311-setuptools"

inherit rpm
