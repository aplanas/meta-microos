SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "orjson is a fast JSON library for Python. \
It benchmarks as the fastest Python library for JSON."
LICENSE = "Apache-2.0 | MIT"

PV = "3.8.10"

RPM_NAME = "python39-orjson-3.8.10-1.1.aarch64.rpm"
RPM_HASH = "fe4e2d5348c39626c9143ac52fe53b572370129eefccdc873987af0fd3f360cdde076ae46132d079079eb441ecb0a26aaef422eae54672a8ba448b06c4ccb815"

RPROVIDES:${PN} += "python3.9dist(orjson) python39-orjson python39-orjson(aarch-64) python3dist(orjson)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
