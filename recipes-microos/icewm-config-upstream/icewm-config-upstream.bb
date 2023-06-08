SUMMARY = "Window Manager with a Taskbar -- Default configuration"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small. \
 \
Configuration files from upstream provider without suse branding"
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.2"

RPM_NAME = "icewm-config-upstream-3.3.2-1.3.noarch.rpm"
RPM_HASH = "e4f879e00a898d2ab97d1661ec3b65660d7e33e5aa10d819624a2b38a13135a8ad725c468c153f103c50a108d047bc8ff9de0465dc3d00583a59b5e43dfd036d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icewm-config-upstream) icewm-config-upstream icewm-configuration-files"
RDEPENDS:${PN} += ""

inherit rpm
