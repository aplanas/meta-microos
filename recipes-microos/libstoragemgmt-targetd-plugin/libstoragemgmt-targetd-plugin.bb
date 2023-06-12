SUMMARY = "Files for targetd array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-targetd-plugin package contains plug-in for targetd \
array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-targetd-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "72852774bef09415f47e1df207d3dee2c11a601a855bd19f64f82d761f7d02d247677c4b2825ae8048e6d48feaeae3cb8a7e8c0e138a3a600feb4c361e685f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-targetd-plugin"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-libstoragemgmt"

inherit rpm
