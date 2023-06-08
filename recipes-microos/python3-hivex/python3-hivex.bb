SUMMARY = "Python bindings for libhivex"
DESCRIPTION = "This subpackage contains the Python bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "python3-hivex-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "7b23dc9eac6727f9b4a9849699bc66afbfae3fea2e7c79ba6d1e2d69714bde028c927849bd854005acab48f8479c023c0bef0c77381085ca90b5a0ba860a3df1"

RPROVIDES:${PN} += "libhivexmod.so()(64bit) python-hivex python3-hivex python3-hivex(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhivex.so.0()(64bit) python(abi)"

inherit rpm
