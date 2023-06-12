SUMMARY = "Compact LMS7002 library suitable for MCU"
DESCRIPTION = "Compact LMS7002 library suitable for MCU."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20200518"

RPM_NAME = "liblms7compact0-0.0.0+git.20200518-1.11.aarch64.rpm"
RPM_HASH = "f1a0767bbfd36dd4387d81af7791230ca037cafd0f1a9996ba946dba8e6aa86deffabf0ddb484f4a8e182c9570b7a15e2928d95b91b341b83d72d462d8837f72"

RPROVIDES:${PN} += "liblms7compact.so.0()(64bit) \
liblms7compact0 \
liblms7compact0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
