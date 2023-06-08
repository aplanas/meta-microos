SUMMARY = "Python 3.6+ interface to libheif library"
DESCRIPTION = "libheif allows conversion of HEIC format images to other formats such as JPEG. pyheif is a python wrapper for libheif"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python310-pyheif-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "ee13e5e9e16638a131719d57251a78961e74d155959bef62829d458b074ffb55711f1d8cb97f3281e7368ff439cf687ac94ca576cade7f7e0720fc58228480a9"

RPROVIDES:${PN} += "python3-pyheif python3.10dist(pyheif) python310-pyheif python310-pyheif(aarch-64) python3dist(pyheif)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libheif.so.1()(64bit) python(abi)"

inherit rpm
