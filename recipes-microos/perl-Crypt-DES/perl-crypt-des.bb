SUMMARY = "Perl DES encryption module"
DESCRIPTION = "The module implements the Crypt::CBC interface, which has the following \
methods \
 \
* blocksize \
  =item keysize \
  =item encrypt \
  =item decrypt"
LICENSE = "BSD-3-Clause"

PV = "2.07"

RPM_NAME = "perl-Crypt-DES-2.07-5.36.aarch64.rpm"
RPM_HASH = "836a48add07cedbde952dcdb285915154d9d1c67bede8bd0b35b733f79b263a4f5bd702fc101cd48566a4b1e783a685409bfd6f4696a04aa09e99c0db84f2782"

RPROVIDES:${PN} += "perl(Crypt::DES) perl-Crypt-DES perl-Crypt-DES(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
