SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2020.9.18"

RPM_NAME = "python310-lfdfiles-2020.9.18-2.13.aarch64.rpm"
RPM_HASH = "45060dfd00a6f1e67e43fe65aa8a8ce3f71fc0691790a984111ab0cdc9da3dcf3e8e265be5b31662d6704fcd0d53e9f82f947ea839d100132fefe0e629c726d2"

RPROVIDES:${PN} += "python3-lfdfiles python3.10dist(lfdfiles) python310-lfdfiles python310-lfdfiles(aarch-64) python3dist(lfdfiles)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) python(abi) python310-click python310-czifile python310-matplotlib python310-netpbmfile python310-numpy python310-oiffile python310-tifffile update-alternatives"

inherit rpm
