SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python310-pyscard-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "51d6002bbb0c41fdb22172b5eae4cd200719f926058464225e0beba06c363daf306459044d638653e6e17f99686607f9bda993a02fbcb63e3ae3ff7db6fe7d89"

RPROVIDES:${PN} += "python3-pyscard python3.10dist(pyscard) python310-pyscard python310-pyscard(aarch-64) python3dist(pyscard)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) pcsc-ccid python(abi)"

inherit rpm
