SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python39-pymilter-1.0.4-3.12.aarch64.rpm"
RPM_HASH = "665bdb1bd4e2880c1bc95dd864cb8a3eea4a20b26c1609a06c4da99b4225dad0ccf7c7479fe0cf39ae75c9d653383794c352db10aa6513067a8288a108e4b2a8"

RPROVIDES:${PN} += "python3.9dist(pymilter) \
python39-pymilter \
python39-pymilter(aarch-64) \
python3dist(pymilter)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmilter.so.1.0()(64bit) \
pymilter-common \
python(abi) \
python39 \
python39-py3dns"

inherit rpm
