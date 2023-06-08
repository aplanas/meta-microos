SUMMARY = "Zypper rule to prevent uninstallation of transactional-update"
DESCRIPTION = "Adds a zypper rule to prevent accidental uninstallation of \
transactional-update."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.1.5"

RPM_NAME = "transactional-update-zypp-config-4.1.5-1.1.noarch.rpm"
RPM_HASH = "60f5d46330d67c89a8ecbe0b6d2e25599f0fb0db5050f2d03969e539b325df03704e8b9ac7b61e5e598cee18497d58c03273e41ea50c4a530f0eb177f5afa62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(transactional-update-zypp-config) transactional-update-zypp-config"
RDEPENDS:${PN} += "transactional-update"

inherit rpm
