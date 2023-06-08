SUMMARY = "Python bindings for libcap-ng library"
DESCRIPTION = "The libcap-ng-python package contains the bindings so that libcap-ng \
and can be used by Python applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "python3-capng-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "e32c6dfc2f0d0c43bbbdd7e669372315c7e2d21845abd06216d538d5608e109ae0c1d344a3651f73d38b588f6c029d0509ecb5ce324086e8cfe2823995bee9e3"

RPROVIDES:${PN} += "python3-capng python3-capng(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcap-ng.so.0()(64bit) libcap-ng0 python(abi)"

inherit rpm
