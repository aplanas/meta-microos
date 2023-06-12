SUMMARY = "Script to run a virtualized X-Server"
DESCRIPTION = "This script starts an instance of Xvfb, the 'fake' X server, runs a command \
with that server available, and kills the X server when done. The return \
value of the command becomes the return value of this script."
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "xvfb-run-1.5.2-7.2.noarch.rpm"
RPM_HASH = "842cd5040d622e3fd042b23ac6da81a1ca68d298a7d48e0ff1caf9d570cc69142b30368c7e7175c00a2342d04662054f32e2e43655b0fff7f1683f496897fd97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xvfb-run"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
util-linux \
which \
xauth \
xorg-x11-server \
xorg-x11-xauth"

inherit rpm
