SUMMARY = "Localization support for DateTime.pm"
DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales. \
 \
If you want to know what methods are available for locale objects, then \
please read the DateTime::Locale::FromData documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.380000"

RPM_NAME = "perl-DateTime-Locale-1.380000-1.1.noarch.rpm"
RPM_HASH = "47d063ad720787e4d983ac63177769feecb6344ae321097eaf4ef98398e3534d582fd6169d20ccabc1618855a6511dc44a0f65157dda61c0475fd89778a6b70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Locale) perl(DateTime::Locale::Base) perl(DateTime::Locale::Catalog) perl(DateTime::Locale::Data) perl(DateTime::Locale::FromData) perl(DateTime::Locale::Util) perl-DateTime-Locale"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Dist::CheckConflicts) perl(File::ShareDir) perl(List::Util) perl(Params::ValidationCompiler) perl(Specio::Declare) perl(Specio::Library::String) perl(namespace::autoclean)"

inherit rpm
