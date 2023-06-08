SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-numcodecs-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "b5c35900008cb0b71325a0f9d280885d8c08c8554444f7b7a1f4f5328b125dc0a7ee47578d5bd7117e0a7212721ad9b394518f097a203fce4f5699ca1bd825c9"

RPROVIDES:${PN} += "python3.11dist(numcodecs) python311-numcodecs python311-numcodecs(aarch-64) python3dist(numcodecs)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblosc.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) liblz4.so.1()(64bit) libzstd.so.1()(64bit) python(abi) python311-entrypoints python311-numpy"

inherit rpm
