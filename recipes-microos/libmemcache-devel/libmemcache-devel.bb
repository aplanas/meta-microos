SUMMARY = "Development files for libmemcache"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package contains the development files for libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache-devel-1.4.0.rc2-152.25.aarch64.rpm"
RPM_HASH = "0df5e167aa816d5522c6456b954fe985ff6492fdf4962293a789ca5270251209b6561a11eb4296ff3911362d6eadf1e41ecb905822377fd2e0cdcb1e4936d3a8"

RPROVIDES:${PN} += "libmemcache-devel \
libmemcache-devel(aarch-64)"
RDEPENDS:${PN} += "libmemcache0"

inherit rpm
