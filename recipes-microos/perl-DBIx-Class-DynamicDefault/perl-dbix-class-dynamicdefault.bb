SUMMARY = "Automatically set and update fields"
DESCRIPTION = "Automatically set and update fields with values calculated at runtime."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-DBIx-Class-DynamicDefault-0.04-2.19.noarch.rpm"
RPM_HASH = "e6b2e3c496d956d26a145f0dfb418cfbe9ef123b4ea0680d3e45b7162d47347ca8d887892f1751e488f38b4d2783a8a63ec8b6e8669b703f7674969f9f5c4309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Class::DynamicDefault) perl-DBIx-Class-DynamicDefault"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DBIx::Class)"

inherit rpm
