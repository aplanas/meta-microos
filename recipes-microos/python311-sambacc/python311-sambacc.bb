SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.88.c81c65a"

RPM_NAME = "python311-sambacc-v0.2+git.88.c81c65a-1.1.noarch.rpm"
RPM_HASH = "aa56ec7005c5c063b0d4e14c7960e11e8d32a5a41fa17ded3bff5193de32a7edf82f2aa636ea718ad6d685419a80d3c560304aaace822650dbc67f06fc0a2eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-sambacc"
RDEPENDS:${PN} += "python(abi) python3-pyxattr samba-python3"

inherit rpm
