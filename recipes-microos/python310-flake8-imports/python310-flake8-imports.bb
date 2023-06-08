SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-flake8-imports-0.1.1-2.15.noarch.rpm"
RPM_HASH = "aee03ad23a4ec88fe332e656e476b40b85de4e902ab9130161dc502ada222842f26b7889fcba57a6116a170e5218196e10cd58bf72d032024cb68d0eee943e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-imports python3.10dist(flake8-imports) python310-flake8-imports python3dist(flake8-imports)"
RDEPENDS:${PN} += "python(abi) python310-isort"

inherit rpm
