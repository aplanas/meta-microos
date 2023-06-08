SUMMARY = "Window Manager with a Taskbar"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.2"

RPM_NAME = "icewm-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "16562f51cc44a5119602bc8a1b43f8f0b7ad942c9e3d779df1ac0bcf4b9b6598c38a29eba56e2bbfe9f0683375f59641e44a1f3321ca187c139cfa617927ed2f"

RPROVIDES:${PN} += "icewm icewm(aarch-64) icewm-gnome windowmanager"
RDEPENDS:${PN} += "/bin/sh alsa-utils desktop-data icewm-bin icewm-configuration-files imlib2-loaders update-alternatives xdg-menu xterm-bin"

inherit rpm
