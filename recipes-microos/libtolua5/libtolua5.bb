SUMMARY = "Shared libraries for tolua"
DESCRIPTION = "This package provides shared libraries for tolua."
LICENSE = "GPL-2.0+"

PV = "5.2.4"

RPM_NAME = "libtolua5-5.2.4-4.2.aarch64.rpm"
RPM_HASH = "8172d09c2af2bcbf4c6a84c52f0aeb04b7ccf589f1a35524fe44cf5e67bba44cd3ce182aac1f3978d3b88fc4234fbe34b88feec789adfd7d9b684554b68a0d7a"

RPROVIDES:${PN} += "libtolua.so.5()(64bit) libtolua5 libtolua5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
