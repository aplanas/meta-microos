SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python311-sane-2.9.1-1.11.aarch64.rpm"
RPM_HASH = "171cc668c0ffbb24a4c3acca2352f0ac5b2f385bba16b8a93726074aa866cf9b96eeb9fd3ffa0276fa05689aab60817124b7a21103743987dffd537f8abbb19d"

RPROVIDES:${PN} += "python3.11dist(python-sane) \
python311-sane \
python311-sane(aarch-64) \
python3dist(python-sane)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsane.so.1()(64bit) \
python(abi)"

inherit rpm
