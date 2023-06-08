SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-pytest-env-0.6.2-3.1.noarch.rpm"
RPM_HASH = "6162ca662b00574e9250425e4c1781e515ab20997c03345c146a1332de0d10236026875d5703481f407b44a8d23a088a5caa82ec46d28b0d97bd6c0b34b9baab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-env python3.10dist(pytest-env) python310-pytest-env python3dist(pytest-env)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
