SUMMARY = "The reference C implementation of Argon2"
DESCRIPTION = "Reference C implementation of Argon2, the password-hashing function \
that won the Password Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "libargon2-1-20190702-2.6.aarch64.rpm"
RPM_HASH = "d81b62bacbb65703474c63e05ba6eb555275f86d237b72821a7f258d1f3fa1fcc3423c42eec3dac6bee06d21dc526de6c31a8b9aad2606be562382b6a78dd6e1"

RPROVIDES:${PN} += "libargon2-1 libargon2-1(aarch-64) libargon2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
