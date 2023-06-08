SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-pycups-2.0.1-2.8.aarch64.rpm"
RPM_HASH = "a4c68d9df622134b7525c831c05a1d241bcece292bdb6975d15cc68061f988972838bf3f2789f350c057019538cc19fc1823ee7601c7d4cb69d8ac8103a21671"

RPROVIDES:${PN} += "python3.9dist(pycups) python39-cups python39-pycups python39-pycups(aarch-64) python3dist(pycups)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcups.so.2()(64bit) python(abi)"

inherit rpm
