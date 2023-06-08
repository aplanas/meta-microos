SUMMARY = "Service for verifying that important services are running"
DESCRIPTION = "health-checker is a service running once at every reboot to verify \
that all important services are running. If it is the first reboot after \
an update, an automatic rollback to the last working snapshot is made. \
If this is not after an update, a reboot is made. If this does not help, \
the services will be disabled. \
This package does not contain any checks. For this, additional \
plugins for different products are needed."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "health-checker-1.7-1.2.noarch.rpm"
RPM_HASH = "78e66e79b2638594d3a289f56cf9795b3dc8e1b2044c14fcc1060af8244cc429fa7678d99b9d011c12c9f2413ed63330ffe58bbe0981ca560464745b38dd6873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker"
RDEPENDS:${PN} += "/bin/bash /bin/sh health-checker-plugins"

inherit rpm
