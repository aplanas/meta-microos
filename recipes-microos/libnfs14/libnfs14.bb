SUMMARY = "Client library for accessing NFS shares over a network"
DESCRIPTION = "Package contains a library of functions for accessing NFSv2 and \
NFSv3 servers from user space. It provides a low-level, \
asynchronous RPC library for accessing NFS protocols, an \
asynchronous library with POSIX-like VFS functions, and a \
synchronous library with POSIX-like VFS functions."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "libnfs14-5.0.2-1.4.aarch64.rpm"
RPM_HASH = "d157a3e688aeee1a7996308928d63b7a1af3c5c6566a2d026a3542dce1042fa98f699308f6f76bc84fa5ef99c0e1ddb7f71b9cff7c1abe5c71dfe8782fa6555d"

RPROVIDES:${PN} += "libnfs.so.14()(64bit) libnfs14 libnfs14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
