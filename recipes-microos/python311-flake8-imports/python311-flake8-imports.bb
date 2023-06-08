SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-flake8-imports-0.1.1-2.15.noarch.rpm"
RPM_HASH = "c1385c0d4803c9e86dc53b94cac687dcbd79559ae13c3b66ecc4a36685986fae67cd0be7af2f57b78f6762c6fee9d3e3a6f2cc8fb0f48f414f365583941bc640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-imports) python311-flake8-imports python3dist(flake8-imports)"
RDEPENDS:${PN} += "python(abi) python311-isort"

inherit rpm
