SUMMARY = "Replacement for 'buffer' with many more Features"
DESCRIPTION = "mbuffer is a raplacement for buffer with additional functionality: \
- display of I/O speed \
- optional use of memory mapped I/O for huge buffers \
- multithreaded instead of sharedmemory ipc \
- multi volume support \
- autoloader support \
- networking support \
- compatible command-line options"
LICENSE = "GPL-3.0-or-later"

PV = "20220418"

RPM_NAME = "mbuffer-20220418-1.4.aarch64.rpm"
RPM_HASH = "6f50e0fb833392eb676b91a3e6028c67b46bec917380a5670bf4379d8e22dcb0285ce45a5cf1d10cfc24d88bb88ef7122bda6a9772ff4eda69ce4c1934c620eb"

RPROVIDES:${PN} += "mbuffer mbuffer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
