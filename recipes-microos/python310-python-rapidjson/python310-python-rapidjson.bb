SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python310-python-rapidjson-1.9-1.5.aarch64.rpm"
RPM_HASH = "7cf842934908118c4fadb9328636318ebbe37e20f14739039f7b2f7d04e6a07723c11926b0b598b4e52dc2c7b27b8fd811b2b6f8c1fe6932e90be9117cf2c343"

RPROVIDES:${PN} += "python3-python-rapidjson python3.10dist(python-rapidjson) python310-python-rapidjson python310-python-rapidjson(aarch-64) python3dist(python-rapidjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
