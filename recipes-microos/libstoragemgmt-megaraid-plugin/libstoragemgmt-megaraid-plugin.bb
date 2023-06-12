SUMMARY = "Files for LSI MegaRAID support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-megaraid-plugin package contains the plugin for LSI MegaRAID \
storage management via storcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-megaraid-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "fc7ea8594a2e47db09d2a1d03c0d7512d4cacf305eb24bf08b43a2a2a84829b6333b541a46347e81425b87442ca31c088fbd095be79fc710917adb4cf59b1573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libstoragemgmt-megaraid-plugin) \
libstoragemgmt-megaraid-plugin"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-libstoragemgmt"

inherit rpm
