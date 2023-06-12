SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python310-xxhash-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "5e53cda7e1579773aac15b9ec39d36515c6d2a63937a36be772f05edf8d9a8bb3bb91298a5a5f257d74d6da3ca69d281e369a0f0bc7c502ee43e03cf57c965ec"

RPROVIDES:${PN} += "python3-xxhash \
python3.10dist(xxhash) \
python310-xxhash \
python310-xxhash(aarch-64) \
python3dist(xxhash)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxxhash.so.0()(64bit) \
python(abi)"

inherit rpm
