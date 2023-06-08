SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-pytest-env-0.6.2-3.1.noarch.rpm"
RPM_HASH = "1042bfa2bda5e48626fe811ffd293fb6b29d183fa1117d552448d9b16a80d6d170a1d71f263930ad9599ecec5d2097cf8666c80b36f9525e4fa89d910af38414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-env) python39-pytest-env python3dist(pytest-env)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
