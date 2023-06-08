SUMMARY = "Configure-time utilities for using C headers,"
DESCRIPTION = "Often Perl modules are written to wrap functionality found in existing C \
headers, libraries, or to use OS-specific features. It is useful in the \
_Build.PL_ or _Makefile.PL_ file to check for the existance of these \
requirements before attempting to actually build the module. \
 \
Objects in this class provide an extension around ExtUtils::CBuilder to \
simplify the creation of a _.c_ file, compiling, linking and running it, to \
test if a certain feature is present. \
 \
It may also be necessary to search for the correct library to link against, \
or for the right include directories to find header files in. This class \
also provides assistance here."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-ExtUtils-CChecker-0.11-1.9.noarch.rpm"
RPM_HASH = "f656fe5dd2ac5e60fe944db3a711cf1154a34ea66ea900320c2aaef9d835ddd0e514c6603734152a093ec5058ea8941eb47bdaf37db9f82390c6831df8714fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::CChecker) perl-ExtUtils-CChecker"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(ExtUtils::CBuilder)"

inherit rpm
