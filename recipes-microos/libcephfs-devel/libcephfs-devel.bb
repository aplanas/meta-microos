SUMMARY = "Ceph distributed file system headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use Ceph distributed file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "libcephfs-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "639e3ff0edd1e8d17aef3e21161e9c343c09d4c7bc563ab004de9f24cbecb335fc2b22eba8dc52f6a7f539b75688ebe31b5fc5422ab7d9f1347e4dbe4236e35d"

RPROVIDES:${PN} += "libcephfs-devel libcephfs-devel(aarch-64) libcephfs2-devel"
RDEPENDS:${PN} += "libcephfs2 librados-devel"

inherit rpm
