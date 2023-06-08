SUMMARY = "Reed-Solomon decoder for Compact Discs"
DESCRIPTION = "The library implements a Reed-Solomon decoder for Compact Discs with \
a mechanism for Error Detection and Correction (EDC)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libedc_ecc_dec1_0-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "42cb22c617561a1c466f815664fab95ba807628c1791d40bee93cba3d3a8b4a1c7396919aff3eea1103e72fdde84369e4a2cd23bb82bb2208d2ced57b2c5227b"

RPROVIDES:${PN} += "libedc_ecc_dec.so.1.0()(64bit) libedc_ecc_dec.so.1.0(SCHILY_1.0)(64bit) libedc_ecc_dec1_0 libedc_ecc_dec1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libedc_ecc.so.1.0()(64bit) libedc_ecc.so.1.0(SCHILY_1.0)(64bit) libedc_ecc.so.1.0(SCHILY_1.1)(64bit)"

inherit rpm
