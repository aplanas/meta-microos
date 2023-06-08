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

RPM_NAME = "python39-tox-3.26.0-4.1.noarch.rpm"
RPM_HASH = "1c721b3560e56b13ab20908a68cbf4c670d3c3153b2633fb342679880d178fb66745592d2ab41937166da8a1f6821dcbb8b6129604b7a4f46b4cbf65730dbe6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tox) python39-tox python3dist(tox)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 0.12 if python3-base < 3.8) /bin/sh /usr/bin/python3.9 python(abi) python39-backports.entry_points_selectable python39-filelock python39-packaging python39-pip python39-pluggy python39-py python39-six python39-toml python39-tomli python39-virtualenv update-alternatives"

inherit rpm
