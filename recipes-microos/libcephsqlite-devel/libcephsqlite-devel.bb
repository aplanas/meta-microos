SUMMARY = "SQLite3 VFS for Ceph headers"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "libcephsqlite-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "fe57fc9cbb54096614e27055c25fe986331bfcf75b250dedb537f1fd3326f585536b75bcf764a1297336f9366fced1c3e8821eba286caa605a3814cb3d10a0e1"

RPROVIDES:${PN} += "libcephsqlite-devel libcephsqlite-devel(aarch-64)"
RDEPENDS:${PN} += "libcephsqlite librados-devel libradospp-devel sqlite-devel"

inherit rpm
