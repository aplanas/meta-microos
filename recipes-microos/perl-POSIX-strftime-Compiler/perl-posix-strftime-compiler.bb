SUMMARY = "GNU C library compatible strftime for loggers and servers"
DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications. \
 \
For generate same result strings on any locale, POSIX::strftime::Compiler \
wraps POSIX::strftime and converts some format characters to perl code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-POSIX-strftime-Compiler-0.44-1.13.noarch.rpm"
RPM_HASH = "92ca02b3541eb94ecc5f1ed13226fa90d076964173eefbbbac89784adff828eaed1363719b4ceb7e2e7bfa485f5b91038169e2fca9ca8020af25247f64f93943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(POSIX::strftime::Compiler) perl-POSIX-strftime-Compiler"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
