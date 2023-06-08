SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python310-Durus-4.2-1.10.aarch64.rpm"
RPM_HASH = "31d4ce31f413ed2de6d1adb25adb5629815d914b6cb39245686b460152da65eb597e832c1a3787f7de8291286e23deb130350db556de15089af75ca81b8f039c"

RPROVIDES:${PN} += "python3-Durus python3.10dist(durus) python310-Durus python310-Durus(aarch-64) python3dist(durus)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) update-alternatives"

inherit rpm
