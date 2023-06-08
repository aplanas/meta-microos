SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm-devel-0.189-2.3.aarch64.rpm"
RPM_HASH = "76f9c4b3748ecfee2644e8e784a1dbd372967e60766070517bd11f2d6259ad9083d733b730d85db9998f2b11db38fe3d9610ee01af2693952f48f2fd25e42fa9"

RPROVIDES:${PN} += "libasm-devel libasm-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libasm1"

inherit rpm
