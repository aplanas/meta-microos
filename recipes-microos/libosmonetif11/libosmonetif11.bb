SUMMARY = "Osmocom library for muxed audio"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmonetif11-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4acbf8fdd4f89fa654e6e339ea32c2cdf1b8cdf786e6d49e33e3c799db15a85ddebe7be71c95364de2b4a347a7813220258c35db8815ac586837d363d9af2dac"

RPROVIDES:${PN} += "libosmonetif.so.11()(64bit) \
libosmonetif11 \
libosmonetif11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
