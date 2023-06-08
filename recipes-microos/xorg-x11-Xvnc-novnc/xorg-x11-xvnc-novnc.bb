SUMMARY = "NoVNC service for Xvnc"
DESCRIPTION = "A service that starts noVNC linked to Xvnc server."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-novnc-1.13.1-3.1.noarch.rpm"
RPM_HASH = "43270844a00114ea2b84972fc048498ecb275937f749792716193dd8fd782cbacb7606d76614f24a2a344a02cb6c476b534caaa67a884ffed5bc0f68e53e36f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-novnc"
RDEPENDS:${PN} += "/bin/sh novnc python3-websockify systemd xorg-x11-Xvnc"

inherit rpm
