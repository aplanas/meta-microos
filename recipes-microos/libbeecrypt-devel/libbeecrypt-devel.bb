SUMMARY = "An open source cryptography library"
DESCRIPTION = "BeeCrypt is an ongoing project to provide a strong and fast \
cryptography toolkit. Includes entropy sources, random generators, \
block ciphers, hash functions, message authentication codes, \
multiprecision integer routines, and public key primitives."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.2"

RPM_NAME = "libbeecrypt-devel-4.1.2-28.12.aarch64.rpm"
RPM_HASH = "422522efc3a61e821107f915b20b5e3ec5c440ef8360640bb587ca115ed12196090f7aeb6c39365eb78766973026c34b72b0e586f188da75563c4f488d164e0c"

RPROVIDES:${PN} += "libbeecrypt-devel libbeecrypt-devel(aarch-64)"
RDEPENDS:${PN} += "libbeecrypt6"

inherit rpm
