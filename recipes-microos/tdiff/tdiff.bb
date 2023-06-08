SUMMARY = "File tree diff tool"
DESCRIPTION = "Compare file system trees, showing any differences in their: \
  - file size, \
  - file block count (physical storage size), \
  - owner user and group ids (uid & gid), \
  - access, modification and inode change times, \
  - hard link count, and sets of hard linked files, \
  - extended attributes (if supported), \
  - ACLs (if supported)."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.6"

RPM_NAME = "tdiff-0.8.6-1.4.aarch64.rpm"
RPM_HASH = "6925bd17bc78e2ab76f280c4c785736dc88a6c2c3fd19f30953f520fe992d1778c928e02ff062faaf6173eea20bcd2b817916e1ec7dd5299911975435df9c645"

RPROVIDES:${PN} += "tdiff tdiff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
