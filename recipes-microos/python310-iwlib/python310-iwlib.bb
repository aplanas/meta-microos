SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python310-iwlib-1.6.2-1.20.aarch64.rpm"
RPM_HASH = "b2166a593a6c3744689ee6953ff62c637b44dd96b8bb2c4ed2357dd51d82b39b72cb77668761be008d243af806889336eb52a745f26260f2771a181f0eb774a4"

RPROVIDES:${PN} += "python3-iwlib \
python3.10dist(iwlib) \
python310-iwlib \
python310-iwlib(aarch-64) \
python3dist(iwlib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libiw.so.30()(64bit) \
python(abi) \
python310-cffi"

inherit rpm
