SUMMARY = "String handling essentials library"
DESCRIPTION = "This package provides the string handling essentials shared library \
used by the rsyslog daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "libestr0-0.1.11-1.16.aarch64.rpm"
RPM_HASH = "71e2f33903e36ffe3653cdc37338bbf8e59f4b9e6b14fcab24473fa8c73e221bed952166a72ff6b865fc680a2c51eb0187d30aa3d027a087be2730552f87f270"

RPROVIDES:${PN} += "libestr.so.0()(64bit) \
libestr0 \
libestr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
