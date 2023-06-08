SUMMARY = "Perl interface to the MD4 Algorithm"
DESCRIPTION = "The 'Digest::MD4' module allows you to use the RSA Data Security Inc. MD4 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
The 'Digest::MD4' module provides a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.9"

RPM_NAME = "perl-Digest-MD4-1.9-5.37.aarch64.rpm"
RPM_HASH = "c619a4dab22802900f451df36809b9845d1464f8d145fc771c6f7d06be506098f1e362803fc2ca266d4ab26dc341bdc851329210b39107f8a7314380b887a49c"

RPROVIDES:${PN} += "perl(Digest::MD4) perl-Digest-MD4 perl-Digest-MD4(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
