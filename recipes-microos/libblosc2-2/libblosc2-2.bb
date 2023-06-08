SUMMARY = "A fast, compressed, persistent binary data store library for C"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data \
(i.e. floating point numbers, integers and booleans)."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "libblosc2-2-2.7.1-2.3.aarch64.rpm"
RPM_HASH = "cde7f5f6f1746f08323a14ccc42f8e98a51d788a787dfb501a328594401c42f65257c11d09d07f28d860599b9e9e67513a7fedd64fae05bf30852bae9fac85bc"

RPROVIDES:${PN} += "libblosc2-2 libblosc2-2(aarch-64) libblosc2.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
