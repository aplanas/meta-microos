SUMMARY = "Tie plain hashes to DBI interface"
DESCRIPTION = "This module has been created to act as a drop-in replacement for modules \
that tie straight perl hashes to disk, like 'DB_File'. When the running \
system does not have enough memory to hold large hashes, and disk-tieing \
won't work because there is not enough space, it works quite well to tie \
the hash to a database, which preferable runs on a different server. \
 \
This module ties a hash to a database table using *only* a 'key' and a \
'value' field. If no tables specification is passed, this will create a \
temporary table with 'h_key' for the key field and a 'h_value' for the \
value field. \
 \
I think it would make sense to merge the functionality that this module \
provides into 'Tie::DBI'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-Tie-Hash-DBD-0.24-1.1.noarch.rpm"
RPM_HASH = "cfbd4d9695e650d0bf31c7d2471f33733d96c27be2fbaae2886b6ea088b9d3546df24821c54b2c2ce60979bf0ea23db0882df51380d2eb490dc464d25b10dc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tie::Array::DBD) \
perl(Tie::Hash::DBD) \
perl-Tie-Hash-DBD"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBI) \
perl(Test::More)"

inherit rpm
