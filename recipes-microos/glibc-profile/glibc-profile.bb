SUMMARY = "Libc Profiling and Debugging Versions"
DESCRIPTION = "This package contains special versions of the GNU C library which are \
necessary for profiling and debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-profile-2.37-4.1.aarch64.rpm"
RPM_HASH = "e32694a00cac263c760a79f0c527d405b6f46199a49d834b20273fc3fb42dd9866a2ddc77646562c2bbb9e9ebc16e94ff1d78c0fcb6775bccd6f5bd184af9002"

RPROVIDES:${PN} += "glibc-profile \
glibc-profile(aarch-64)"
RDEPENDS:${PN} += "glibc"

inherit rpm
