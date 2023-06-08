SUMMARY = "Print lines matching a pattern"
DESCRIPTION = "The grep command searches one or more input files for lines containing a \
match to a specified pattern.  By default, grep prints the matching lines."
LICENSE = "GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "grep-3.10-1.1.aarch64.rpm"
RPM_HASH = "3d9e370953ce41c9f55b3679b6a040e5148046d627f83b62fcdaf9187527d6410b49be88e7588b659ea32184ded41fe8daa68182ec01bc16619d0a88738cb5ff"

RPROVIDES:${PN} += "/bin/grep base:/usr/bin/grep grep grep(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
