SUMMARY = "A simple obfusacting tool"
DESCRIPTION = "Simple-obfs is a simple obfusacting tool, designed as plugin server of shadowsocks."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "simple-obfs-0.0.5-4.16.aarch64.rpm"
RPM_HASH = "db9fa13c38dc72bd0a8c421ec8e4eda9051837ce8f7def08eae3698a1e4f9b22d5f6f22774fccbdbf705e2821c88534104f5ec683ef8740bfbea62e4b13a3923"

RPROVIDES:${PN} += "simple-obfs simple-obfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libev.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
