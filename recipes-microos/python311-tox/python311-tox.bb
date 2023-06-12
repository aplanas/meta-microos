SUMMARY = "Virtualenv-based automation of test activities"
DESCRIPTION = "Tox as is a generic virtualenv management and test command line tool you can \
use for: \
 \
* checking your package installs correctly with different \
  Python versions and interpreters \
 \
* running your tests in each of the \
  environments, configuring your test tool of choice \
 \
* acting as a frontend to Continuous Integration \
  servers, greatly reducing boilerplate and merging \
  CI and shell-based testing."
LICENSE = "MIT"

PV = "4.5.1"

RPM_NAME = "python311-tox-4.5.1-2.1.noarch.rpm"
RPM_HASH = "1256cadeb269d3715fefa4a4544583cef8b9d6caf99029fdefd210f585868005f82bf7b16cc8d116b86ae115865c67f7d02654f94263ae632c971f176bd8da2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tox) python311-detox python311-tox python3dist(tox)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 0.12 if python3-base < 3.8) /bin/sh /usr/bin/python3.11 python(abi) python311-cachetools python311-chardet python311-colorama python311-filelock python311-packaging python311-platformdirs python311-pluggy python311-pyproject-api python311-tomli python311-virtualenv update-alternatives"

inherit rpm
