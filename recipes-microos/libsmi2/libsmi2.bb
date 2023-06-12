SUMMARY = "Libsmi Shared Libraries"
DESCRIPTION = "The purpose of libsmi is to \
 \
* Give network management applications a concise programmer-friendly \
   interface to access MIB module information \
 \
* Separate the knowledge on SMI from the main parts of management \
   applications \
 \
* Allow addition of new kinds of MIB repositories without the need to \
adapt applications that make use of libsmi"
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi2-0.4.8-25.7.aarch64.rpm"
RPM_HASH = "4d6e81fbe97c90f4927272e583c2ed558a8af00b1370cf089dc324955a7542674fa26c1bb020bd451ccf11b38d4bc27da91a98b97ae6b03577e8905e9dc5ac5d"

RPROVIDES:${PN} += "libsmi.so.2()(64bit) \
libsmi2 \
libsmi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsmi"

inherit rpm
