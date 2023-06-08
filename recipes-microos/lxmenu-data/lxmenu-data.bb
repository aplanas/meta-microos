SUMMARY = "A tool to build desktop menu for LXDE"
DESCRIPTION = "LXSession is the default X11 session manager of LXDE. \
(LXDE: Lightweight X11 Desktop Environment) \
http://lxde.sourceforge.net/ \
 \
This package provides files required to build freedesktop.org \
menu spec-compliant desktop menus for LXDE."
LICENSE = "GPL-2.0"

PV = "0.1.5"

RPM_NAME = "lxmenu-data-0.1.5-1.17.noarch.rpm"
RPM_HASH = "3a90aaad3aad44d9a318f76edd66697f9b82f7d9e67ce578302e0f63a25829a61b4f42f8a92e53566a558f2e4b65a72b50abcc6b00c840809d5a23c1afeb21cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lxmenu-data) lxmenu-data"
RDEPENDS:${PN} += "/bin/sh desktop-file-utils"

inherit rpm
