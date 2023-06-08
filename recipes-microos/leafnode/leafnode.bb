SUMMARY = "Leaf site NNTP server"
DESCRIPTION = "Leafnode is a small NNTP server for leaf sites without permanent \
connection to the internet. It supports a subset of NNTP and is able to \
automatically fetch the newsgroups the user reads regularly from the \
newsserver of the ISP and additionally offer local (site-specific) \
groups to a LAN."
LICENSE = "MIT"

PV = "2.0.0+git.1677927696.44d2783"

RPM_NAME = "leafnode-2.0.0+git.1677927696.44d2783-3.3.aarch64.rpm"
RPM_HASH = "08619155e646e23942079f40c6e1807ed39c020686fe8cb4c431b09d1446c445ec26ed2b0b8f489f3d6d1216f11130aecdad3c42944001705cf80b473a4fffc6"

RPROVIDES:${PN} += "config(leafnode) leafnode leafnode(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpcre.so.1()(64bit) permissions shadow systemd"

inherit rpm
