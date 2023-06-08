SUMMARY = "Development files for SCTP (Stream Control Transmission Protocol)"
DESCRIPTION = "This package contains the SCTP development libraries and C header \
files. \
 \
SCTP (Stream Control Transmission Protocol) is a message oriented, \
reliable transport protocol, with congestion control, support for \
transparent multi-homing, and multiple ordered streams of messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "lksctp-tools-devel-1.0.19-2.1.aarch64.rpm"
RPM_HASH = "fcaa881916f4d1391d77f9c7cdf2022c2f95df025bdbb7c0ff6e36f83ed176c8c435c77ac6506f6f46ae600902ece603d6c9a1527e38522d3824d2ae07dfd865"

RPROVIDES:${PN} += "lksctp-tools-devel lksctp-tools-devel(aarch-64) pkgconfig(libsctp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel lksctp-tools"

inherit rpm
