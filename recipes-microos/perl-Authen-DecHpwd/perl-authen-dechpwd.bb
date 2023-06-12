SUMMARY = "DEC VMS password hashing"
DESCRIPTION = "This module implements the 'SYS$HASH_PASSWORD' password hashing function \
from VMS (also known as 'LGI$HPWD'), and some associated VMS username and \
password handling functions. \
 \
The password hashing function is implemented in XS, with a hideously slow \
pure Perl backup version for systems that can't handle XS."
LICENSE = "GPL-2.0+"

PV = "2.007"

RPM_NAME = "perl-Authen-DecHpwd-2.007-1.28.aarch64.rpm"
RPM_HASH = "90950a02b15f04d1e600b931a736bd5a7b1ddfe6c08087db60572330dafbccc7de4b20ceedf218e13c2061f4f5fedf75fad25e6b5d3d7f075d1d152aef0f1a74"

RPROVIDES:${PN} += "perl(Authen::DecHpwd) \
perl-Authen-DecHpwd \
perl-Authen-DecHpwd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Integer) \
perl(Digest::CRC) \
perl(Scalar::String) \
perl(parent)"

inherit rpm
