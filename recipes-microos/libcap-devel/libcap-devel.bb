SUMMARY = "Development files for libcap"
DESCRIPTION = "Development files (Headers, libraries for static linking, etc) for \
libcap. \
 \
libcap is a library for getting and setting POSIX.1e (formerly POSIX 6) \
draft 15 capabilities. \
 \
Install libcap-devel if you want to develop or compile applications \
using libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.68"

RPM_NAME = "libcap-devel-2.68-1.1.aarch64.rpm"
RPM_HASH = "3d9e0360ab69dfdc2778930579209ef2c7c708510e2b4bdfcda3f69d9211c5d4a7deea10fe072a9c36b4f7a58834422a42832608b5e82c8294a2a39e3f3becf0"

RPROVIDES:${PN} += "libcap-devel libcap-devel(aarch-64) pkgconfig(libcap) pkgconfig(libpsx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libcap2 libpsx2"

inherit rpm
