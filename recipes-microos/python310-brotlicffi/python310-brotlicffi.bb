SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python310-brotlicffi-1.0.9.2-1.11.aarch64.rpm"
RPM_HASH = "5c7f75bc3502fb5435d2a1f60e09125b8739b1b1488eb829ddc557d2f8a1c4237fe6a661c8d8746a7914607ce56abc79594d1dc4aaa67c77f2ddd5d4a542dd03"

RPROVIDES:${PN} += "python3-brotlicffi python3.10dist(brotlicffi) python310-brotlicffi python310-brotlicffi(aarch-64) python3dist(brotlicffi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-cffi"

inherit rpm
