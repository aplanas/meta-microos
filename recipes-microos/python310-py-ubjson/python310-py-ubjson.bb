SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python310-py-ubjson-0.16.1-1.11.aarch64.rpm"
RPM_HASH = "3acfbef4b8f563f5edf8a77d2448bbb15395e6de7a4f0eabe7b94ec423cbd9e4bfde89329bd4a22fe1188575c53bed1cab975aeee39cb6b092466e2006c7acbb"

RPROVIDES:${PN} += "python3-py-ubjson \
python3.10dist(py-ubjson) \
python310-py-ubjson \
python310-py-ubjson(aarch-64) \
python3dist(py-ubjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
