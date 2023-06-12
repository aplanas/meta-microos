SUMMARY = "A Stream-Oriented Non-Interactive Text Editor"
DESCRIPTION = "Sed takes text input, performs one or more operations on it, and \
outputs the modified text. Sed is typically used for extracting parts \
of a file using pattern matching or  for substituting multiple \
occurrences of a string within a file."
LICENSE = "GPL-3.0-or-later"

PV = "4.9"

RPM_NAME = "sed-4.9-2.3.aarch64.rpm"
RPM_HASH = "2c024ec4b05d50b4dec60c31c1111bc48f3355af40dd5725a32588f966660bf35cc07e8afaa3dcb160791e4ac44c5bbefca610f26dbf583ed78d676d2d3d0a62"

RPROVIDES:${PN} += "/bin/sed \
base:/bin/sed \
sed \
sed(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
