SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.88.c81c65a"

RPM_NAME = "python39-sambacc-v0.2+git.88.c81c65a-1.1.noarch.rpm"
RPM_HASH = "e4d3576f83d835aad4969b50e7867d039c2de3d0274f6d65e8d985c44ae85e6e8b12209c3ccd2341e7c9329752f4ebd7169579f8c2eb0618658d24bf25b94d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sambacc"
RDEPENDS:${PN} += "python(abi) python3-pyxattr samba-python3"

inherit rpm
