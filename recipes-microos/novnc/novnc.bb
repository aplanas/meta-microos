SUMMARY = "VNC client using HTML5 (Web Sockets, Canvas) with encryption support"
DESCRIPTION = "This package provides a Websocket implementation of the VNC client. \
It is used by OpenStack Horizon to provide a console view of running \
instances."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.4.0"

RPM_NAME = "novnc-1.4.0-1.1.noarch.rpm"
RPM_HASH = "c6a418b1c890cacef2151e45bb3415d43811bff112d63f9e55e6ad2e678d3e91bd1e5488f325a98cdd7ed85e27d08b9b1f0eb8409f3b37dc43090ed246be36a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "novnc"
RDEPENDS:${PN} += "/bin/bash python3-websockify which"

inherit rpm
