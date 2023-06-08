SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2020.9.18"

RPM_NAME = "python311-lfdfiles-2020.9.18-2.13.aarch64.rpm"
RPM_HASH = "6efa0f59169937093e4d1bd9df4b25c48bf0f1c33636e5a855aa0d6246f688642ab048df055ce6cf873ee6347d7492045a3e164e48e90725135346cfa71eccb3"

RPROVIDES:${PN} += "python3.11dist(lfdfiles) python311-lfdfiles python311-lfdfiles(aarch-64) python3dist(lfdfiles)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) python(abi) python311-click python311-czifile python311-matplotlib python311-netpbmfile python311-numpy python311-oiffile python311-tifffile update-alternatives"

inherit rpm
