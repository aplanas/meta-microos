SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python39-python-rapidjson-1.9-1.5.aarch64.rpm"
RPM_HASH = "242f1793c768ca671993513c87fdd127d5e53c557080ff6b596f902550c2a6e4ee815a3e5385980783b5375516d1c081e8537c9a304f293b2a010f68473e9df4"

RPROVIDES:${PN} += "python3.9dist(python-rapidjson) python39-python-rapidjson python39-python-rapidjson(aarch-64) python3dist(python-rapidjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
