SUMMARY = "Updates the system regularly to stay current and safe"
DESCRIPTION = "Service to keep an OS update to date and secure. It is run by a \
systemd.timer daily and can inform rebootmgrd that the update \
requires a reboot."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "os-update-1.11-2.1.noarch.rpm"
RPM_HASH = "e47c9d4d0a8fc40754bae2fbad2b33465bcd7ae3e67c59a64da1145d2e022b5a616b9f4449b946241002a7b3869e2db6d64cbcb650e1272fe9b4251ddebfe24b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-update"
RDEPENDS:${PN} += "/bin/bash /bin/sh lsof zypper-needs-restarting"

inherit rpm
