SUMMARY = "CAVS testing framework and utilities"
DESCRIPTION = "Includes the Composite Application Validation System (CAVS) \
testing framework and utilities."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-cavs-1.0.2u-15.1.aarch64.rpm"
RPM_HASH = "b14d6a9896ea22427b6bfb423742f11e4c70ab437609069a2da293fa57182c3152ba8840b372f04155e0d2102a75c5caaafc85be689984740d5517c3637d825b"

RPROVIDES:${PN} += "openssl-1_0_0-cavs openssl-1_0_0-cavs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenssl1_0_0 libz.so.1()(64bit)"

inherit rpm
