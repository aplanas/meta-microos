SUMMARY = "Transactional Updates with btrfs and snapshots"
DESCRIPTION = "transactional-update is a tool to update a system in an atomic \
way with zypper, btrfs and snapshots."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.1.5"

RPM_NAME = "transactional-update-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "c0044eb31efc55a4951ad6b298713a98fa974ab0a7d29dcfd44cc416bdbaf6243ee6d689aa11129a341e24f29fb36721407ccfea0b8f0b96cf6c96d214360307"

RPROVIDES:${PN} += "transactional-update transactional-update(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/bc dracut-transactional-update logrotate lsof psmisc tukit zypper"

inherit rpm
