SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python39-zstd-1.5.5.1-1.1.aarch64.rpm"
RPM_HASH = "81a010cae00eaf9f2cc2acf47669356b76d75caf02d3f18de8199c3c70029f4b04ee9b51216059f1de956d1a94f2fa431c17b417a72a78f6f54eca9e4ef3dc52"

RPROVIDES:${PN} += "python3.9dist(zstd) python39-zstd python39-zstd(aarch-64) python3dist(zstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzstd.so.1()(64bit) python(abi)"

inherit rpm
