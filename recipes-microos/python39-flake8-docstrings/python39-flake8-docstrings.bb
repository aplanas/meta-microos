SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-flake8-docstrings-1.6.0-1.6.noarch.rpm"
RPM_HASH = "73505033417ecfc32ef8376e1406f30ef2d0eaa62b1ff9b25ea82ea3bc3cefee66fb034d800a93c81204eb5835e35d3f02b9f9a4db3822e64437e39b7636163c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-docstrings) \
python39-flake8-docstrings \
python3dist(flake8-docstrings)"
RDEPENDS:${PN} += "python(abi) \
python39-flake8 \
python39-flake8-polyfill \
python39-pydocstyle"

inherit rpm
