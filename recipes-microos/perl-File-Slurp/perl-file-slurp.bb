SUMMARY = "Perl module for reading/writing/modifying complete files"
DESCRIPTION = "This module provides subs that allow you to read or write entire files with \
one simple call. They are designed to be simple to use, have flexible ways \
to pass in or get the file contents and to be very efficient. There is also \
a sub to read in all the files in a directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "9999.32"

RPM_NAME = "perl-File-Slurp-9999.32-1.13.noarch.rpm"
RPM_HASH = "ac879091880c8ec1fb4474c6a9511daa2e7cb4be0fe1fadd08b386a4848558099a3770e8bc25cb88c800d534490ddc3b82108df92ea349dbd543319bf3922992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Slurp) perl-File-Slurp"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
