SUMMARY = "Development files for libcorrect"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcorrect."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20180109"

RPM_NAME = "libcorrect-devel-0.0.0+git.20180109-3.8.aarch64.rpm"
RPM_HASH = "ebfbfadecee2f803b8174579832f1feb0a012cc9976312371649a1592f9d382253b406157e920573e7d0c99173bacdc25e7591245d63109c4642aa48b105659b"

RPROVIDES:${PN} += "libcorrect-devel \
libcorrect-devel(aarch-64) \
pkgconfig(libcorrect)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcorrect0_0_0"

inherit rpm
