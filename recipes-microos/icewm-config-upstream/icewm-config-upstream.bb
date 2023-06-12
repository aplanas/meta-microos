SUMMARY = "Window Manager with a Taskbar -- Default configuration"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small. \
 \
Configuration files from upstream provider without suse branding"
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "icewm-config-upstream-3.3.5-1.1.noarch.rpm"
RPM_HASH = "8a48fee813d59fe9df2b773ac35a21ae1d013baa1b53ccc57baee062b480fb403404a474a37b0b7000f4e8708fd71b1c06edcfc8ec62975fd13ed0495a1834fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icewm-config-upstream) \
icewm-config-upstream \
icewm-configuration-files"
RDEPENDS:${PN} += ""

inherit rpm
