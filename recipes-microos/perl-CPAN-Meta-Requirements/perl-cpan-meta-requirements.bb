SUMMARY = "Set of Version Requirements for a Cpan Dist"
DESCRIPTION = "A CPAN::Meta::Requirements object models a set of version constraints like \
those specified in the _META.yml_ or _META.json_ files in CPAN \
distributions, and as defined by CPAN::Meta::Spec; It can be built up by \
adding more and more constraints, and it will reduce them to the simplest \
representation. \
 \
Logically impossible constraints will be identified immediately by thrown \
exceptions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.140000"

RPM_NAME = "perl-CPAN-Meta-Requirements-2.140000-1.25.noarch.rpm"
RPM_HASH = "5f50efac7fd3ed7658789c9836990b15f9f6f159fc0e41ee1c17e58fb8dbb97fc0ee95eb49b2625612425b6bf8bcb2a6484f7d92563f40fd169a41196f1fa4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Meta::Requirements) perl-CPAN-Meta-Requirements"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(version)"

inherit rpm
