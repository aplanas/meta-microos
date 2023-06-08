SUMMARY = "Recursive pattern replacement utility"
DESCRIPTION = "rrep is a pattern replacement utility.  It comes with support for regular \
expressions, recursive directory processing, backup, simulation and prompting. \
The replacement string may contain special characters to refer to portions of \
the matched pattern."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.7"

RPM_NAME = "rrep-1.3.7-1.2.aarch64.rpm"
RPM_HASH = "78321af7f2b9aefedf2dfc48e4e3686fe3adf2c04002a1d8c710558b4580a6a4b1a8f324cb5d9f1abaecd9db1dffc9d192cc1c902584e9bb6e66bb93c8ddebf2"

RPROVIDES:${PN} += "rrep rrep(aarch-64)"
RDEPENDS:${PN} += "/bin/sh info ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
