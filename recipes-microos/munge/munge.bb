SUMMARY = "An authentication service for creating and validating credentials"
DESCRIPTION = "MUNGE (MUNGE Uid 'N' Gid Emporium) is an authentication service for \
creating and validating user credentials.  It is designed to be highly \
scalable for use in an HPC cluster environment.  It provides a portable \
API for encoding the user's identity into a tamper-proof credential \
that can be obtained by an untrusted client and forwarded by untrusted \
intermediaries within a security realm.  Clients within this realm can \
create and validate credentials without the use of root privileges, \
reserved ports, or platform-specific methods."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "munge-0.5.15-2.4.aarch64.rpm"
RPM_HASH = "4e1c7cbfab3af782ecb02f8d19d651947d40b5e7de00d78aa372916b68ed3e94609d52a5bc56df9dbaf4a0126ebadf15929e30b66a719ed6f457e01fe33dcca4"

RPROVIDES:${PN} += "config(munge) group(munge) munge munge(aarch-64) user(munge)"
RDEPENDS:${PN} += "/bin/sh coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libmunge.so.2()(64bit) libz.so.1()(64bit) logrotate shadow systemd"

inherit rpm
