SUMMARY = "Emulate the MySQL PASSWORD() function"
DESCRIPTION = "Crypt::MySQL emulates MySQL PASSWORD() SQL function, without \
libmysqlclient. You can compare encrypted passwords, without real MySQL \
environment."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Crypt-MySQL-0.04-1.35.aarch64.rpm"
RPM_HASH = "7f4fd263ca74c56dd7b8be7b7ba4a62ab6c694d88dfff7e2b74a3118f5efeb25de75defcc1e407a617b9c5676360096d41d173be237c53f7224c657b40ca862e"

RPROVIDES:${PN} += "perl(Crypt::MySQL) \
perl-Crypt-MySQL \
perl-Crypt-MySQL(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Digest::SHA1)"

inherit rpm
