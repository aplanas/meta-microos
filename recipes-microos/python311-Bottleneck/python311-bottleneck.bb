SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python311-Bottleneck-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "a72e9bd2f6a1c066b4590ae79afe76cfce47c58f6c2541498f3098b0e21b46e80baac220a89ff9eca92e9ebeb6bcf545fbc1009f9a7cddc374dba21e84171e31"

RPROVIDES:${PN} += "python3.11dist(bottleneck) \
python311-Bottleneck \
python311-Bottleneck(aarch-64) \
python3dist(bottleneck)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-numpy"

inherit rpm
