SUMMARY = "SunPy core package: Python for Solar Physics"
DESCRIPTION = "SunPy is a Python library for solar physics data analysis and visualization."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "4.1.3"

RPM_NAME = "python39-sunpy-4.1.3-2.2.aarch64.rpm"
RPM_HASH = "246e7144d69560804480baed2daa988cc0dd285a9a5edbf605b9704485f95af93fd0c31f45956b3049dc031b606484d86bb6a5b9e2c05e5b4850303ba312029e"

RPROVIDES:${PN} += "python3.9dist(sunpy) \
python39-sunpy \
python39-sunpy(aarch-64) \
python3dist(sunpy)"
RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
python(abi) \
python39-aioftp \
python39-astropy \
python39-numpy \
python39-packaging \
python39-parfive"

inherit rpm
