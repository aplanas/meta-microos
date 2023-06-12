SUMMARY = "Low Complexity Communication Codec (LC3) - Development Files"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides all the necessary files for development with \
liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "liblc3-devel-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "49c1b52f4ae03a2edb913e0862c097ef49c03f5e717b7189d07cfee305982875e7cbbd5f97dd2e8e4aacc40139a5cdc8b5c54a74da081e69e95bc7f990f4694e"

RPROVIDES:${PN} += "liblc3-devel \
liblc3-devel(aarch-64) \
pkgconfig(lc3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblc3-1"

inherit rpm
