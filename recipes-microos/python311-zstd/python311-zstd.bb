SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python311-zstd-1.5.5.1-1.1.aarch64.rpm"
RPM_HASH = "7247c0a1efb319f51e8a805863fc6eafea3ffd2f9966ff5362d1f7998c2351b6b8258529f2138e50598175edc8483e30e9511e12ea7f2932cbaf24e731e9e07b"

RPROVIDES:${PN} += "python3.11dist(zstd) python311-zstd python311-zstd(aarch-64) python3dist(zstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzstd.so.1()(64bit) python(abi)"

inherit rpm
