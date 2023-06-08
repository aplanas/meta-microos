SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python310-lscsoft-glue-3.0.1-1.4.aarch64.rpm"
RPM_HASH = "5f87f09c4e12c1e0dc433da9d38adf3dc854c00ff14c23cef60f9b8eee1846e54d14110d84ffbf90b155280d9b51315d7918b45ea95b5c704afe77ac78a68c13"

RPROVIDES:${PN} += "python-glue python3-glue python3-lscsoft-glue python3.10dist(lscsoft-glue) python310-glue python310-lscsoft-glue python310-lscsoft-glue(aarch-64) python3dist(lscsoft-glue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lscsoft-glue-data python(abi) python310-ligo-segments python310-numpy python310-pyRXP update-alternatives"

inherit rpm
