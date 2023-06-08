SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a free open source distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. Supports networking, abstract \
resources, offers a library, encryption and peer authentication. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "libflom0-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "79b62b73c8841b286f12a5df5513e5c736a9823932d2bd291309552be7b666b0c8b00ee31b04478736a59651a4a78eafafab18624caee9fe5a8bbca8860a2378"

RPROVIDES:${PN} += "libflom.so.0()(64bit) libflom0 libflom0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
