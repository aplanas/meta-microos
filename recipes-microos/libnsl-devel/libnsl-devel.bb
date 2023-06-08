SUMMARY = "Development package for Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6. \
This package contains all files to develop and link against libnsl."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl-devel-2.0.0-1.13.aarch64.rpm"
RPM_HASH = "ec8e4097525dc77b5a45e1c64d2ae53fb5d54d5ac7d813d401b95de1b28866c4a86f60a476359732ddd5d2f4038ce57ccc4a93de7cf1dcb90fbc75ca264ce00c"

RPROVIDES:${PN} += "libnsl-devel libnsl-devel(aarch-64) pkgconfig(libnsl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnsl3 pkgconfig(libtirpc)"

inherit rpm
