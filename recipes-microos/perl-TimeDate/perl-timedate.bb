SUMMARY = "TimeDate Perl module"
DESCRIPTION = "Date::Parse provides two routines for parsing date strings into time values. \
 \
str2time(DATE [, ZONE]) \
 \
   str2time parses DATE and returns a unix time value, or undef upon failure. \
    ZONE, if given, specifies the timezone to assume when parsing if the date \
    string does not specify a timezome. \
 \
strptime(DATE [, ZONE]) \
 \
   strptime takes the same arguments as str2time but returns an array of values \
    ($ss,$mm,$hh,$day,$month,$year,$zone). Elements are only defined if they \
    could be extracted from the date string. The $zone element is the timezone \
    offset in seconds from GMT. An empty array is returned upon failure."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.33"

RPM_NAME = "perl-TimeDate-2.33-1.13.noarch.rpm"
RPM_HASH = "4c662b520b6a272a7e352135a8bd95d064614d37f41ad4b20684b26dc8210bc9bab35ce919bd7db6011142639ef173ef0b2250ef48fa2a87ec3d7caabfe439f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Date::Format) perl(Date::Format::Generic) perl(Date::Language) perl(Date::Language::Afar) perl(Date::Language::Amharic) perl(Date::Language::Austrian) perl(Date::Language::Brazilian) perl(Date::Language::Bulgarian) perl(Date::Language::Chinese) perl(Date::Language::Chinese_GB) perl(Date::Language::Czech) perl(Date::Language::Danish) perl(Date::Language::Dutch) perl(Date::Language::English) perl(Date::Language::Finnish) perl(Date::Language::French) perl(Date::Language::Gedeo) perl(Date::Language::German) perl(Date::Language::Greek) perl(Date::Language::Hungarian) perl(Date::Language::Icelandic) perl(Date::Language::Italian) perl(Date::Language::Norwegian) perl(Date::Language::Occitan) perl(Date::Language::Oromo) perl(Date::Language::Romanian) perl(Date::Language::Russian) perl(Date::Language::Russian_cp1251) perl(Date::Language::Russian_koi8r) perl(Date::Language::Sidama) perl(Date::Language::Somali) perl(Date::Language::Spanish) perl(Date::Language::Swedish) perl(Date::Language::Tigrinya) perl(Date::Language::TigrinyaEritrean) perl(Date::Language::TigrinyaEthiopian) perl(Date::Language::Turkish) perl(Date::Parse) perl(Time::Zone) perl(TimeDate) perl-TimeDate"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
