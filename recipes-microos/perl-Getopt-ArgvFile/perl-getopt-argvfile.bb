SUMMARY = "Perl Module to interpolate Script Options from Files into @ARGV"
DESCRIPTION = "This module simply interpolates option file hints in @ARGV by the contents of \
the pointed files. This enables option reading from files instead of or \
additional to the usual reading from the command line. \
 \
Alternatively, you can process any array instead of @ARGV which is used by \
default and mentioned mostly in this manual. \
 \
The interpolated @ARGV could be subsequently processed by the usual option \
handling, e.g. by a Getopt::xxx module. Getopt::ArgvFile does not perform any \
option handling itself, it only prepares the array @ARGV."
LICENSE = "Artistic-1.0 | Artistic-2.0"

PV = "1.11"

RPM_NAME = "perl-Getopt-ArgvFile-1.11-9.29.aarch64.rpm"
RPM_HASH = "77df1d2b6f04710df1488b3a64226bb03e3ed3a93366b3e6ad78a5bdf1ca85d0117cdba83ef448030b3d434b97d9c8ef5a063cdf7f5f7ec2cff2a46412851dcb"

RPROVIDES:${PN} += "perl(Getopt::ArgvFile) \
perl-Getopt-ArgvFile \
perl-Getopt-ArgvFile(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
