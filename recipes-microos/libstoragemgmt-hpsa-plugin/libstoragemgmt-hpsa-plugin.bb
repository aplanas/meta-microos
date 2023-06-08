SUMMARY = "Files for HP SmartArray support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-hpsa-plugin package contains the plugin for HP SmartArray storage \
management via hpssacli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-hpsa-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "9759a9884ea3bed057ba6816d61a746c495cbc47486630030abc7a1a69dd5078ef189b2315ec4ffd2be38afc8680369b97c482042c3747d1240fd7c804dc2087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libstoragemgmt-hpsa-plugin) libstoragemgmt-hpsa-plugin"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-libstoragemgmt"

inherit rpm
