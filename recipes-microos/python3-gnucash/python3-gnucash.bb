SUMMARY = "Python bindings for GnuCash"
DESCRIPTION = "This package provides the Python 3 bindings for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "python3-gnucash-4.14-1.2.aarch64.rpm"
RPM_HASH = "e58763797fe4bbf8ca5c343a6d634b35ec526aba51f807675bef2e71da8aaa3194ca16d4a4a75b04fcf10830701322c74c1fe79520bef36db9db7f32e454180b"

RPROVIDES:${PN} += "python3-gnucash python3-gnucash(aarch-64)"
RDEPENDS:${PN} += "gnucash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgnc-app-utils.so()(64bit) libgnc-core-utils.so()(64bit) libgnc-engine.so()(64bit) libgobject-2.0.so.0()(64bit) libpython3.10.so.1.0()(64bit) python(abi)"

inherit rpm
