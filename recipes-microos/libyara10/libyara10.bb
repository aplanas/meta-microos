SUMMARY = "Library to support the yara malware identification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.3.0"

RPM_NAME = "libyara10-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "29f2c383408a4b3272b041c6ff1c8424f6b17db32aa798b802b23b86f3682f0c8ab491d15f110790525d49959b53dadb135a3214ace80783fbd72891a27cf09e"

RPROVIDES:${PN} += "libyara.so.10()(64bit) libyara10 libyara10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmagic.so.1()(64bit)"

inherit rpm
