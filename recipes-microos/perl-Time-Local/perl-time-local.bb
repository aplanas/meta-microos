SUMMARY = "Efficiently compute time from local and GMT time"
DESCRIPTION = "This module provides functions that are the inverse of built-in perl \
functions 'localtime()' and 'gmtime()'. They accept a date as a six-element \
array, and return the corresponding 'time(2)' value in seconds since the \
system epoch (Midnight, January 1, 1970 GMT on Unix, for example). This \
value can be positive or negative, though POSIX only requires support for \
positive values, so dates before the system's epoch may not work on all \
operating systems. \
 \
It is worth drawing particular attention to the expected ranges for the \
values provided. The value for the day of the month is the actual day (i.e. \
1..31), while the month is the number of months since January (0..11). This \
is consistent with the values returned from 'localtime()' and 'gmtime()'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.35"

RPM_NAME = "perl-Time-Local-1.35-1.1.noarch.rpm"
RPM_HASH = "656985314b9f231cffca296b30b1a772b4c09de43d0ca33c32748d9dc019c004d840a5f11555568177fdb4eef2d958311aadb48046906b9c10fdc670faf3d249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Local) \
perl-Time-Local"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
