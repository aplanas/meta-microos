SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.5"

RPM_NAME = "libd0_rijndael0-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "b2c61561dbe9b7ffdc2379687ed1ee52c5c6810c10086f9b6ef2b85a43c236ab020a181ae4fa900f226c87af03432a1ea6af3e02cc6d5a875973220e099cadb0"

RPROVIDES:${PN} += "libd0_rijndael.so.0()(64bit) \
libd0_rijndael0 \
libd0_rijndael0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
