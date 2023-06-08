SUMMARY = "Internet Low Bitrate Codec"
DESCRIPTION = "iLBC (internet Low Bitrate Codec) is a FREE speech codec suitable for \
robust voice communication over IP. The codec is designed for narrow \
band speech and results in a payload bit rate of 13.33 kbit/s with an \
encoding frame length of 30 ms and 15.20 kbps with an encoding length \
of 20 ms. The iLBC codec enables graceful speech quality degradation in \
the case of lost frames, which occurs in connection with lost or \
delayed IP packets."
LICENSE = "GPL-2.0+"

PV = "3951"

RPM_NAME = "libilbc0-3951-122.30.aarch64.rpm"
RPM_HASH = "e0621933d62062c759f47e20c8508a5072b18810333b52491983fe1d5874edaf228c2f74fe7493f90dd9b58dc18272a995e17b36e3fb0bf3660cc2b44d4fde33"

RPROVIDES:${PN} += "ilbc libilbc.so.0()(64bit) libilbc0 libilbc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
