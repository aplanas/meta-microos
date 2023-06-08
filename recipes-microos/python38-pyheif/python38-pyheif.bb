SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python38-pyheif-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "6435b51b48250bf1ff5d408d4f6cb9533e9f58d5dc86a0fefef74a8635c2bc0596749765a8d917f1b975eb57dce81eaf07b95cc0d4d9d0d04547a65539630401"

RPROVIDES:${PN} += "python3.8dist(pyheif) python38-pyheif python38-pyheif(aarch-64) python3dist(pyheif)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libheif.so.1()(64bit) python(abi)"

inherit rpm
