SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python311-ligo-lw-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "867bbdf4c1de537de1db4391b0182a7f6dfdf7bef3be890eba977407448d20d1d1699e5c8cb790e114621ad669007725a968148c71eadafef88043641c023675"

RPROVIDES:${PN} += "python3.11dist(python-ligo-lw) python311-ligo-lw python311-ligo-lw(aarch-64) python3dist(python-ligo-lw)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-PyYAML python311-lal python311-ligo-segments python311-lscsoft-glue python311-python-dateutil python311-tqdm update-alternatives"

inherit rpm
