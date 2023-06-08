SUMMARY = "Laboratory for Fluorescence Dynamics (LFD) file formats"
DESCRIPTION = "Lfdfiles is a Python library and console script for reading, writing, \
converting, and viewing many of the proprietary file formats used to store \
experimental data at the Laboratory for Fluorescence Dynamics."
LICENSE = "BSD-3-Clause"

PV = "2020.9.18"

RPM_NAME = "python39-lfdfiles-2020.9.18-2.13.aarch64.rpm"
RPM_HASH = "e690a95668401c7515196d4950469a0615b8359d97b1e0e1e8ec1200f6b77ae7ca5e00d44cd954845eff09a513c70bb4588266101f953b7e2a80315ce91ed1f6"

RPROVIDES:${PN} += "python3.9dist(lfdfiles) python39-lfdfiles python39-lfdfiles(aarch-64) python3dist(lfdfiles)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) python(abi) python39-click python39-czifile python39-matplotlib python39-netpbmfile python39-numpy python39-oiffile python39-tifffile update-alternatives"

inherit rpm
