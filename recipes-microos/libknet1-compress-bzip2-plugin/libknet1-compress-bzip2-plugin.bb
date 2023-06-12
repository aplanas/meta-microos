SUMMARY = "Provides libknet1 bzip2 support"
DESCRIPTION = "Provides bzip2 compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-bzip2-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "c0e78f133ebac1d88067c51f1f742045a67a3082bcfe2618628f12142f757d8c2f5fff2a9432fe179609d4464169644b3673f51ede33adebad8d45fd02567e4f"

RPROVIDES:${PN} += "libknet1-compress-bzip2-plugin \
libknet1-compress-bzip2-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libknet1(aarch-64)"

inherit rpm
