SUMMARY = "A python-keyring backend for the kernel keyring"
DESCRIPTION = "A python-keyring [1] backend that can be used to access the kernel \
keyring. In particular, this package ships \
 \
- a python-keyring [1] backend for the kernel keyring \
- a special python-keyring backend that can be used by osc \
- a high-level interface to the kernel keyring \
- a low-level module that wraps around the C keyutils library [2] \
 \
[1] https://github.com/jaraco/keyring \
[2] https://git.kernel.org/pub/scm/linux/kernel/git/dhowells/keyutils.git"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-keyring-keyutils-0.1.1-1.10.aarch64.rpm"
RPM_HASH = "cbad63c560434ef4197ce8b34c98c67729f2547535afdb56715a7a68e894aae5d3f6e1ee1956304765ad687b2888b0f1ac4ac3652362d018172d2790ddfa6e22"

RPROVIDES:${PN} += "python3.11dist(keyring-keyutils) \
python311-keyring-keyutils \
python311-keyring-keyutils(aarch-64) \
python3dist(keyring-keyutils)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.4)(64bit) \
python(abi)"

inherit rpm
