SUMMARY = "Shared library for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the shared library for reproc."
LICENSE = "MIT"

PV = "14.2.4"

RPM_NAME = "libreproc14-14.2.4-2.1.aarch64.rpm"
RPM_HASH = "3bef3c5ef06ea870ab0e3959d46b9d652925cd36d4439f4163d658fe4bc3567fe8afe5d2be213849bd52ab81b05aea906e950c4e36bab11b945c8d54989a2fb5"

RPROVIDES:${PN} += "libreproc.so.14()(64bit) libreproc14 libreproc14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit)"

inherit rpm
