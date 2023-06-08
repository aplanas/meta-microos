SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python39-pyscard-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "3698dab9d0519fc0df2c1e6cf9f22fcd740032111d00131df0cc35be485f1d0d57a7a661bcea06aea11b00849b47225662394e20af0791d02c44d6c6e453ea9d"

RPROVIDES:${PN} += "python3.9dist(pyscard) python39-pyscard python39-pyscard(aarch-64) python3dist(pyscard)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) pcsc-ccid python(abi)"

inherit rpm
