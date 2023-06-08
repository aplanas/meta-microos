SUMMARY = "JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "libjasper7-4.0.0-1.3.aarch64.rpm"
RPM_HASH = "c4222cbbac97bdc8113fabd1f905733fb46184087b206544cdbd442abc4ca35685c3c4bfaa16e87e9aa29917a88858349dd15a8312df288d0d91923ce0a2f52c"

RPROVIDES:${PN} += "libjasper.so.7()(64bit) libjasper7 libjasper7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
