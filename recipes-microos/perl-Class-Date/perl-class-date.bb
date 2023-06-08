SUMMARY = "Class for easy date and time manipulation"
DESCRIPTION = "This module is intended to provide a general-purpose date and datetime type \
for perl. You have a Class::Date class for absolute date and datetime, and \
have a Class::Date::Rel class for relative dates. \
 \
You can use '+', '-', '<' and '>' operators as with native perl data types."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.17"

RPM_NAME = "perl-Class-Date-1.1.17-1.19.aarch64.rpm"
RPM_HASH = "ce925dce5549fd0d7074b9719b99593779ceb1d196d39063d05ee7b47f9523a4e280f5d32e940fd9fee4e26e7df53823e855cad6bcc1d10c9fea78867e3a065f"

RPROVIDES:${PN} += "perl(Class::Date) perl(Class::Date::Const) perl(Class::Date::Invalid) perl(Class::Date::Rel) perl-Class-Date perl-Class-Date(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
