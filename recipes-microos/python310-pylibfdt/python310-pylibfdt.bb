SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python310-pylibfdt-1.6.1-1.8.aarch64.rpm"
RPM_HASH = "c563b42af2084160dea82cc98a4572f046aca994223d4ff71f4a9430c8d0691bd6b56fd17bc13eae952266ab83bb68a4fb7b79a6f3f642726d769b4d83d0b387"

RPROVIDES:${PN} += "python3-pylibfdt python3.10dist(pylibfdt) python310-pylibfdt python310-pylibfdt(aarch-64) python3dist(pylibfdt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
