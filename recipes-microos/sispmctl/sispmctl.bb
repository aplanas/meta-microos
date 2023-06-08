SUMMARY = "SIS-PM Control for Linux"
DESCRIPTION = "This projects adds support control for the GEMBIRD Silver Shield PM device to linux."
LICENSE = "GPL-2.0-only"

PV = "4.10"

RPM_NAME = "sispmctl-4.10-1.2.aarch64.rpm"
RPM_HASH = "f98d58034f8b89929a9cf9063b75d57bd8d55df7064691d6d403778bc05b58ff829a8c4713be7c9bcc23da202548df259aea98de7a355c3a459b4b21a2876ffa"

RPROVIDES:${PN} += "sispmctl sispmctl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsispmctl.so.0()(64bit) libusb-0.1.so.4()(64bit)"

inherit rpm
