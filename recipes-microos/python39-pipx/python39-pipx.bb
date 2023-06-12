SUMMARY = "Install and run Python applications in isolated environments"
DESCRIPTION = "Install and run Python applications in isolated environments."
LICENSE = "MIT"

PV = "0.14.0.0"

RPM_NAME = "python39-pipx-0.14.0.0-2.14.noarch.rpm"
RPM_HASH = "c2b0e3f90c5fc26e18a600c7dba20018ce8d4845b2c9798abb2baed88eda39319cc60af7b492f3a22ea61d3c4ccc33c4f4df4e50fd9a90350c703c8a54bb73f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pipx) \
python39-pipx \
python3dist(pipx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-argcomplete \
python39-setuptools \
python39-userpath \
update-alternatives"

inherit rpm
