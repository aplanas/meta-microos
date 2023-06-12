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

RPM_NAME = "python311-python-cjson-1.2.2-2.12.aarch64.rpm"
RPM_HASH = "896cd48d3f05ec4dc82530a1b61171ebd0af4771bd52d3d0cd2fe2696dbf9620ae428a26669b39029bfcc9398e464e74a903bdad25d7cd6a34837c3c07fd4c8c"

RPROVIDES:${PN} += "python3.11dist(python-cjson) \
python311-python-cjson \
python311-python-cjson(aarch-64) \
python3dist(python-cjson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
