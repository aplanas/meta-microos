SUMMARY = "Library for SAS SMP control of expanders"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage holds the library of shared functions."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils1-1-0.99-2.9.aarch64.rpm"
RPM_HASH = "2561321711c2382419a1a9484c11137e8bd512b7387a8018b11720de9a51d76bf6f38ec5a62d0c251f67d0d3a3f9367e1cdc87226a7ad18ead4237231323c0ef"

RPROVIDES:${PN} += "libsmputils1-1 \
libsmputils1-1(aarch-64) \
libsmputils1.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
