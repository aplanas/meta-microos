SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-watchdog-3.0.0-1.2.noarch.rpm"
RPM_HASH = "4b791b9d3c2cc1cf4910b4070b44e6044f332b6e230ec7dcc5a450da9eab8553998b71a11f1ad1b84a8f6400c749517b23a34178ff28d7942db5059ed075a4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(watchdog) \
python39-watchdog \
python3dist(watchdog)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-pathtools \
update-alternatives"

inherit rpm
