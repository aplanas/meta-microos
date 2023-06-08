SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.88.c81c65a"

RPM_NAME = "python310-sambacc-v0.2+git.88.c81c65a-1.1.noarch.rpm"
RPM_HASH = "3549c1d5daea212b855ec4aa6bb4536cb9e8e2485544b1649a53ad6038c6d362ca7728294288112bdbefb0e0e91f53c999e49356278a027b2d4156c6a1d55525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sambacc python310-sambacc"
RDEPENDS:${PN} += "python(abi) python3-pyxattr samba-python3"

inherit rpm
