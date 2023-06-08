SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python39-pyheif-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "d1dfc089306e01848f58c350823469ee6a4653cf9b15ff88075ecf10df0e7aea07813309c0530dc06714b787abc03cf6b0fc8dd324a007a8c6341a9433cd76c4"

RPROVIDES:${PN} += "python3.9dist(pyheif) python39-pyheif python39-pyheif(aarch-64) python3dist(pyheif)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libheif.so.1()(64bit) python(abi)"

inherit rpm
