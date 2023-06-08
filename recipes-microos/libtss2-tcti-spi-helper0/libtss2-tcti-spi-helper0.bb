SUMMARY = "TCTI spi interface library"
DESCRIPTION = "A TCTI module for communication via SPI TPM device driver. Abstracts \
the details of communication with a TPM via SPI protocol. It uses user \
supplied methods for SPI and timing operations in order to be platform \
independent."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-spi-helper0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "a07bf9e576adef00b262e057dc4b5a6e71fed516b7d762852bf824e2503d8caa6732dd4d7b348abdaaa1273472446c63a470c3990a26c1a5cf8ca511e07e376d"

RPROVIDES:${PN} += "libtss2-tcti-spi-helper.so.0()(64bit) libtss2-tcti-spi-helper0 libtss2-tcti-spi-helper0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtss2-mu.so.0()(64bit)"

inherit rpm
