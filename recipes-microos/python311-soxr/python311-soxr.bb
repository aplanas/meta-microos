SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "python311-soxr-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "2d04af838f89b0457fafa5b964219963e0cab28942ebaf139537af6754ef275b60b9f98bd1cd0de5bbdc19a503b89776e2d536307b5009e96ba0a7a02135c568"

RPROVIDES:${PN} += "python3.11dist(soxr) python311-soxr python311-soxr(aarch-64) python3dist(soxr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsoxr.so.0()(64bit) python(abi) python311-numpy"

inherit rpm
