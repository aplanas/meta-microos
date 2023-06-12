SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "python311-lscsoft-glue-3.0.1-1.4.aarch64.rpm"
RPM_HASH = "3410080a099f02cabcd25cd606a3eb766a8924696af945777adc4aec07cdf0cdffdaeaddcbe094e4a61c142c34aee98771fb8d91e3039e7710937825e6708297"

RPROVIDES:${PN} += "python-glue \
python3.11dist(lscsoft-glue) \
python311-glue \
python311-lscsoft-glue \
python311-lscsoft-glue(aarch-64) \
python3dist(lscsoft-glue)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lscsoft-glue-data \
python(abi) \
python311-ligo-segments \
python311-numpy \
python311-pyRXP \
update-alternatives"

inherit rpm
