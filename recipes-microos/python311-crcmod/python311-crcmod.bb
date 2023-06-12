SUMMARY = "CRC Generator"
DESCRIPTION = "The software in this package is a Python module for generating objects that \
compute the Cyclic Redundancy Check (CRC).  There is no attempt in this package \
to explain how the CRC works.  There are a number of resources on the web that \
give a good explanation of the algorithms.  Just do a Google search for 'crc \
calculation' and browse till you find what you need.  Another resource can be \
found in chapter 20 of the book 'Numerical Recipes in C' by Press et. al. \
 \
This package allows the use of any 8, 16, 24, 32, or 64 bit CRC.  You can \
generate a Python function for the selected polynomial or an instance of the \
Crc class which provides the same interface as the ``md5`` and ``sha`` modules \
from the Python standard library.  A ``Crc`` class instance can also generate \
C/C++ source code that can be used in another application."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-crcmod-1.7-8.4.aarch64.rpm"
RPM_HASH = "04c39b476b11323c8ed59db6885bd9a61f16f6dfdba1725603a41ef368179c3d2589dee6b331d749517eb787fa2fefb346de6247a2c1c0ae82ecad1e5620d54d"

RPROVIDES:${PN} += "python3.11dist(crcmod) \
python311-crcmod \
python311-crcmod(aarch-64) \
python3dist(crcmod)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
