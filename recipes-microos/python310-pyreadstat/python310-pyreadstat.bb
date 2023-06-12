SUMMARY = "Package to read and write statistical data files into pandas"
DESCRIPTION = "Reads and Writes SAS, SPSS and Stata files into pandas data frames."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-pyreadstat-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "2c3eb378ce3e3ffb79ee51afd1adcfe28480078169b3182454777c7b0d04eae11d3c845cb1e38b5512e2655c2a517e8c41abce52eb3d4c8754939e88d36f7042"

RPROVIDES:${PN} += "python3-pyreadstat \
python3.10dist(pyreadstat) \
python310-pyreadstat \
python310-pyreadstat(aarch-64) \
python3dist(pyreadstat)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
python(abi) \
python310-numpy \
python310-pandas"

inherit rpm
