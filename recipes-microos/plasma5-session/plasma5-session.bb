SUMMARY = "KDE Plasma 5 X11 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with X11 from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "plasma5-session-5.27.4.1-2.2.noarch.rpm"
RPM_HASH = "4544c9d73601ef924b35c661f4286f9fa7d09efb348870c016bc4d1b4725693557720d0d1e4ab6566b929846fc7de08c14660a59fb7129fbe1d03516da714b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebase4-session plasma5-session"
RDEPENDS:${PN} += "/bin/sh /usr/bin/cut /usr/bin/grep /usr/bin/sed breeze breeze5-decoration khotkeys5 kwin5 libkscreen2-plugin plasma5-desktop plasma5-workspace polkit-kde-agent-5 powerdevil5 systemsettings5 update-alternatives"

inherit rpm
