SUMMARY = "Ceph distributed file system headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use Ceph distributed file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "5114f26f8a32c9425c924fbbeb1fad985d37b199a59e38320bf5ded03bb91dfa8fc884beb38ef911e8abcee88bb9ebdc6e175bac39c6d1f8077768563f3ac3dc"

RPROVIDES:${PN} += "libcephfs-devel libcephfs-devel(aarch-64) libcephfs2-devel"
RDEPENDS:${PN} += "libcephfs2 librados-devel"

inherit rpm
