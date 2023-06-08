SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A set of CLI tools intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.88.c81c65a"

RPM_NAME = "sambacc-v0.2+git.88.c81c65a-1.1.noarch.rpm"
RPM_HASH = "bb23c7b650641dfcad6791dbac6a71f36f289f8dc7831aff94c7fd8744cb527c8fb0dc7a3e68fb5b415dad17c78ce597c8d5401f7cc4907b5991e94d8ae74167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sambacc"
RDEPENDS:${PN} += "/usr/bin/python3 python3-sambacc"

inherit rpm
