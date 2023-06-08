SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python310-ligo-lw-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "71ee92438e714f4dcb0d6a452912144de79f4914f9dff9d05c7f1ad3eb1486c9681ba9dc18b828870179f0b6ff70dea89c6b52d087b7df16be5bebf81a423c6d"

RPROVIDES:${PN} += "python3-ligo-lw python3.10dist(python-ligo-lw) python310-ligo-lw python310-ligo-lw(aarch-64) python3dist(python-ligo-lw)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-PyYAML python310-lal python310-ligo-segments python310-lscsoft-glue python310-python-dateutil python310-tqdm update-alternatives"

inherit rpm
