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

RPM_NAME = "python310-tox-3.26.0-4.1.noarch.rpm"
RPM_HASH = "06c9f9c5907454e57a5e341458d63cf78db5d013d80c86588fd68b072ac521a17fa1be365ea464d5e983f08029574b33ec970429810b4514c060d595cabad23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox python3.10dist(tox) python310-tox python3dist(tox) tox"
RDEPENDS:${PN} += "(python310-importlib-metadata >= 0.12 if python3-base < 3.8) /bin/sh /usr/bin/python3.10 python(abi) python310-backports.entry_points_selectable python310-filelock python310-packaging python310-pip python310-pluggy python310-py python310-six python310-toml python310-tomli python310-virtualenv update-alternatives"

inherit rpm
