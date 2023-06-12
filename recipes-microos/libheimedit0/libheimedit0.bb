SUMMARY = "libedit fork of the Heimdal Kerberos project"
DESCRIPTION = "libedit is a command line editing and history library. It is \
designed to be used by interactive programs that allow the user \
to type commands at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimedit0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "e2b74a6e928c551f9a9d911d28c95648faa138c41d858c76913b3bebaae7c096eca23b5a4e422639f98f39666df595feb7e781c36d8bb61e75b0c61a7fc0e882"

RPROVIDES:${PN} += "libheimedit.so.0()(64bit) \
libheimedit0 \
libheimedit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
