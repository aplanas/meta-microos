SUMMARY = "Python interface to libarchive"
DESCRIPTION = "A Python interface to libarchive. It uses the standard ctypes_ module to \
dynamically load and access the C library."
LICENSE = "CC0-1.0"

PV = "4.0"

RPM_NAME = "python311-libarchive-c-4.0-2.5.noarch.rpm"
RPM_HASH = "6e9b9520754141e791e3b15ad2647fa2a8213802f48cb82dc5fe790b7dfa2d8fc1805fde8f481e89710458a1cf3e0de7597c8c4b7c5885591129c4d3fc8ec2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(libarchive-c) python311-libarchive-c python3dist(libarchive-c)"
RDEPENDS:${PN} += "libarchive13 python(abi)"

inherit rpm
