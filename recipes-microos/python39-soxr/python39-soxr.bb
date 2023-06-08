SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "python39-soxr-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "ab43045a7c2f2ee48567d507f76de51d3fbd508d9d739a319bb3d13b2ffbfd88a7962432073326894b6a1a1d7bd25290063ab18d967f822fa233ba85b1278c96"

RPROVIDES:${PN} += "python3.9dist(soxr) python39-soxr python39-soxr(aarch-64) python3dist(soxr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsoxr.so.0()(64bit) python(abi) python39-numpy"

inherit rpm
