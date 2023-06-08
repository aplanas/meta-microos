SUMMARY = "Development files for libdvbv5"
DESCRIPTION = "The libdvbv5-devel package contains libraries and header files for \
developing applications that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "libdvbv5-devel-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "2ddf32ced7aa3bac20137244eeab739be61b8769160c551050e2baa7c3fd1078ad27f07a998c4b3009af987effcf925849d5578197c1de5f8c917b52bc4c0e0a"

RPROVIDES:${PN} += "libdvbv5-devel libdvbv5-devel(aarch-64) pkgconfig(libdvbv5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdvbv5-0 pkgconfig(libudev)"

inherit rpm
