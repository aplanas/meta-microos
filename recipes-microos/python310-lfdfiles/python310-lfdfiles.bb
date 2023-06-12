SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2023.4.20"

RPM_NAME = "python310-lfdfiles-2023.4.20-1.1.aarch64.rpm"
RPM_HASH = "84fb2630bbff945c133c5bc011649b9d9b512b4a1ffb4ddaca66849b5e48a5b8f088026bdd52ef84899a0a4d78e9af89d67fea84adc90308186eb5c63fb33fcb"

RPROVIDES:${PN} += "python3-lfdfiles python3.10dist(lfdfiles) python310-lfdfiles python310-lfdfiles(aarch-64) python3dist(lfdfiles)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) python(abi) python310-click python310-czifile python310-matplotlib python310-netpbmfile python310-numpy python310-oiffile python310-tifffile update-alternatives"

inherit rpm
