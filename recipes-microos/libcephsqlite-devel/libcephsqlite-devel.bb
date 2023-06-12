SUMMARY = "SQLite3 VFS for Ceph headers"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephsqlite-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "2a5b54fbdb9da25a81e30c5a156e3848b646b1f1f9391953278aea85baf93fe4bc89689814741eb9259995b12c91244152e623a6803f61b7faa190c5b44defed"

RPROVIDES:${PN} += "libcephsqlite-devel libcephsqlite-devel(aarch-64)"
RDEPENDS:${PN} += "libcephsqlite librados-devel libradospp-devel sqlite-devel"

inherit rpm
