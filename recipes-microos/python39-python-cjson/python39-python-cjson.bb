SUMMARY = "C-accelerated JSON encoder/decoder for Python"
DESCRIPTION = "JSON (JavaScript Object Notation) is a text-based data exchange \
format. \
 \
The module is written in C and it is up to 250 times faster when compared to \
the other Python JSON implementations which are written directly in Python. \
This speed gain varies with the complexity of the data and the operation and is \
the the range of 10-200 times for encoding operations and in the range of \
100-250 times for decoding operations."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "python39-python-cjson-1.2.2-2.12.aarch64.rpm"
RPM_HASH = "edade261d172e074bb1b0619b85a2635facfa83ba4132c92a7a5d87dba3b2b418bad8bf3b415ef42e318ede16467f5839ba80c95bfc05e713dc599f6729f1114"

RPROVIDES:${PN} += "python3.9dist(python-cjson) python39-python-cjson python39-python-cjson(aarch-64) python3dist(python-cjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
