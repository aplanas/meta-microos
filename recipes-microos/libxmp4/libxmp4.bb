SUMMARY = "Module Player library for MOD, S3M, IT and others"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including Protacker MOD, ScreamTracker S3M and ImpulseTracker IT."
LICENSE = "LGPL-2.1-only"

PV = "4.5.0+g613.8e4a5e15"

RPM_NAME = "libxmp4-4.5.0+g613.8e4a5e15-1.4.aarch64.rpm"
RPM_HASH = "090ab7b599668c5c1ea737e77f5c6cdbcfadb61d8044d75085ceeccac894aec2e80f1e9da319d65cb6008d2e7f787accc5edd8793c377826c1ee3ac5232b299f"

RPROVIDES:${PN} += "libxmp.so.4()(64bit) libxmp.so.4(XMP_4.0)(64bit) libxmp.so.4(XMP_4.1)(64bit) libxmp.so.4(XMP_4.2)(64bit) libxmp.so.4(XMP_4.3)(64bit) libxmp.so.4(XMP_4.4)(64bit) libxmp.so.4(XMP_4.5)(64bit) libxmp4 libxmp4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
