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

PV = "3.26.0"

RPM_NAME = "python311-tox-3.26.0-4.1.noarch.rpm"
RPM_HASH = "194fa78e0f77dd75678c005862b45b893d5c75ff4b3913675888634986a2d5271b6dcafd1412d3c422d35a41a4b3b3f0c76deb7270db14724d046d6ce9a4b5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tox) python311-tox python3dist(tox)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 0.12 if python3-base < 3.8) /bin/sh /usr/bin/python3.11 python(abi) python311-backports.entry_points_selectable python311-filelock python311-packaging python311-pip python311-pluggy python311-py python311-six python311-toml python311-tomli python311-virtualenv update-alternatives"

inherit rpm
