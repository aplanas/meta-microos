SUMMARY = "Python bindings for libcap-ng library"
DESCRIPTION = "The libcap-ng-python package contains the bindings so that libcap-ng \
and can be used by Python applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "python3-capng-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "fe8d29b233ae9880bf0b15ec9d92626e619b698824aa20789f335df57f9b3e7e53617a8da2eaf38e9882afe325440213619211b630e2b75814b885c496cfaf0a"

RPROVIDES:${PN} += "python3-capng python3-capng(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcap-ng.so.0()(64bit) libcap-ng0 python(abi)"

inherit rpm
