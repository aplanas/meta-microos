SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python311-pyscard-2.0.7-1.1.aarch64.rpm"
RPM_HASH = "5f3e968fa815b7661e641c7f4d3dfc5f94a1bbf1dfb9bc36f5e93ac37eb4745a7b7841ad5c1a0fdfef64e29f91b1ee8081809fd6ad8ba07147896fd23e6ed504"

RPROVIDES:${PN} += "python3.11dist(pyscard) python311-pyscard python311-pyscard(aarch-64) python3dist(pyscard)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) pcsc-ccid python(abi)"

inherit rpm
