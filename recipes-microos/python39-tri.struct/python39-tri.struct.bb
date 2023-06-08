SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-tri.struct-4.1.0-1.4.aarch64.rpm"
RPM_HASH = "86e34d2aa68253d0e0d97ee9f73244cfe9a4e97044c51df804c404d83439e4dde408685c26d8741cf21702789e81875d8563611c9cc8e6a42d82cf1406029a4f"

RPROVIDES:${PN} += "python3.9dist(tri.struct) python39-tri.struct python39-tri.struct(aarch-64) python3dist(tri.struct)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
