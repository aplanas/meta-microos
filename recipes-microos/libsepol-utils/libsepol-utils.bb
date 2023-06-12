SUMMARY = "SELinux binary policy manipulation tools"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-utils-3.5-1.3.aarch64.rpm"
RPM_HASH = "d5203518648a542f3a80b8731c0e9dbe3eb4cbdf3c34feefe5f40be4977cf75583b21f553fced1b738053718ce16ce035376674825393031457e30d9a9b710e8"

RPROVIDES:${PN} += "libsepol-utils \
libsepol-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsepol.so.2()(64bit) \
libsepol.so.2(LIBSEPOL_1.0)(64bit) \
libsepol.so.2(LIBSEPOL_3.4)(64bit)"

inherit rpm
