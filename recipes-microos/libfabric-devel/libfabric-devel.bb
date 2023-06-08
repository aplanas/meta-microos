SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric-devel-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "fe1fe71a5fcb137d9ebeb48c0d0004557d6a89342015ac5d72ac575fe75a829ad2afe6861188bda51656d5c338a8842b4a4dc430376990ec6d60da9095fda8d2"

RPROVIDES:${PN} += "libfabric-devel libfabric-devel(aarch-64) pkgconfig(libfabric)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfabric1"

inherit rpm
