SUMMARY = "Service and firewalld files for glances"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface. \
 \
This packages contains the service file to start a glances server \
from systemd and a firewalld file to open the default port."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "glances-common-3.3.1-1.1.noarch.rpm"
RPM_HASH = "a0c792be99db6f2a263320984e0f5053cd989b93900910c696467bf663b32841b234568334d4e3e425058b461a058f3a208979b62be55cb9443259bd4c96a612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances-common"
RDEPENDS:${PN} += "/bin/sh \
glances"

inherit rpm
