SUMMARY = "Zypper rule to prevent uninstallation of transactional-update"
DESCRIPTION = "Adds a zypper rule to prevent accidental uninstallation of \
transactional-update."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "transactional-update-zypp-config-4.2.1-1.1.noarch.rpm"
RPM_HASH = "bd37c5e629ad8156e736c24d02a3b814d2acdc8197d1a4ccab3f5c6a3cd3df9be7a8dc6c3607419aae8eb9cd6293c73c457a09586fe09094e5f1b9bf4b0eecef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(transactional-update-zypp-config) transactional-update-zypp-config"
RDEPENDS:${PN} += "transactional-update"

inherit rpm
