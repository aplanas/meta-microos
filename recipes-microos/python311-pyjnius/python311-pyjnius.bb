SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-pyjnius-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "bd662de7106fddf30a76b409b1e2dc44297152a657f2cdd09f6136ce07ebee8728db78ba3c75c14296b5f1e1d9c0549b85717155aed6115cfcdaf414831278d6"

RPROVIDES:${PN} += "python3.11dist(pyjnius) \
python311-pyjnius \
python311-pyjnius(aarch-64) \
python3dist(pyjnius)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python(abi) \
python311-Cython"

inherit rpm
