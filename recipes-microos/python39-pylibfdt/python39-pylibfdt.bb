SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python39-pylibfdt-1.6.1-1.8.aarch64.rpm"
RPM_HASH = "d768e9352d661519df3814dffacb425bbaa642e2162767addfc0fc1b43b942ef8752f0b379350c4e6fdf93c14c3bc77cc4ece72cc515facde09b931c09f43a99"

RPROVIDES:${PN} += "python3.9dist(pylibfdt) \
python39-pylibfdt \
python39-pylibfdt(aarch-64) \
python3dist(pylibfdt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
