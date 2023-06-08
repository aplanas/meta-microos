SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python311-pyheif-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "998e73f58b189e23154381ede7cc6725f2867e35bd7de1e025552343e2ea3199a2c836d8cd2ee37d49ef0e866eb95b83a925d432265cdedadd94e9da54c8c3cf"

RPROVIDES:${PN} += "python3.11dist(pyheif) python311-pyheif python311-pyheif(aarch-64) python3dist(pyheif)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libheif.so.1()(64bit) python(abi)"

inherit rpm
