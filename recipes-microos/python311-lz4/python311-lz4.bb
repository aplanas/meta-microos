SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python311-lz4-4.3.2-1.4.aarch64.rpm"
RPM_HASH = "24862aed3801f1f201c469eb32adc3bea7feb9b5672867d0c588b334cc296292a51234fccd407beab8ada4ae311f65ccf3dd450a110731bedfd0f220688ff571"

RPROVIDES:${PN} += "python3.11dist(lz4) \
python311-lz4 \
python311-lz4(aarch-64) \
python3dist(lz4)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblz4.so.1()(64bit) \
python(abi)"

inherit rpm
