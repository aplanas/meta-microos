SUMMARY = "Script to restore Xfce Panel Defaults"
DESCRIPTION = "This package provides a script /usr/bin/xfce4-panel-restore-defaults which calls allows to restore the Xfce Panel factory defaults. \
A desktop file and application launcher is provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-panel-restore-defaults-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "17934116d79ab1fcae172bf790636ae38e4514859be098490be61555d8f1de6dea17a89fc4e6dd9915e6f3e0e357cca44236ee467977a47d352f963cdd997587"

RPROVIDES:${PN} += "application() application(xfce4-panel-restore-defaults.desktop) xfce4-panel-restore-defaults xfce4-panel-restore-defaults(aarch-64)"
RDEPENDS:${PN} += "/bin/bash zenity"

inherit rpm
