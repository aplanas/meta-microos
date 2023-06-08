SUMMARY = "Low level tools for XTRX"
DESCRIPTION = "Low level tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrxll-tools-0.0.0+git.20201202-2.6.aarch64.rpm"
RPM_HASH = "303cabece939ebb57f072e287b356a66000c353f2d876079a6ff6cb3b2e98695474fde2b5215f5029ce032d220544e4a248a7d5a4866c105284467a11f954228"

RPROVIDES:${PN} += "xtrxll-tools xtrxll-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxtrxll.so.0()(64bit)"

inherit rpm
