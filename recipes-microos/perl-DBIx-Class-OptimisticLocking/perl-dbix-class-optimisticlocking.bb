SUMMARY = "Optimistic locking support for DBIx::Class"
DESCRIPTION = "Optimistic locking support for DBIx::Class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-DBIx-Class-OptimisticLocking-0.02-1.26.noarch.rpm"
RPM_HASH = "5452613bcd31579d4c4a3591e4605a8e0c347611e031ebc9784357ba787b117c24d60758b9aafd4b16ea4b470bea52e584ff59ab30135cafc211696969449778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Class::OptimisticLocking) perl-DBIx-Class-OptimisticLocking"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DBIx::Class)"

inherit rpm
