SUMMARY = "Tie-able array that allows only unique values"
DESCRIPTION = "This package lets you create an array which will allow only one occurrence \
of any value. \
 \
In other words no matter how many times you put in 42 it will keep only the \
first occurrence and the rest will be dropped. \
 \
You use the module via tie and once you tied your array to this module it \
will behave correctly. \
 \
Uniqueness is checked with the 'eq' operator so among other things it is \
case sensitive. \
 \
As a side effect the module does not allow undef as a value in the array."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.08"

RPM_NAME = "perl-Array-Unique-0.08-7.24.noarch.rpm"
RPM_HASH = "ee7cccf049af28bebfccd7e79a65876cd0d67f2b733fe89df523b848cae335ade2f6387e7e061810b8bae98064e88ba6ac90329c3bb232c0b76a354e7348a717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Array::Unique) perl-Array-Unique"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
