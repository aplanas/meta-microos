SUMMARY = "Distribution of modules to handle locale codes"
DESCRIPTION = "*Locale-Codes* is a distribution containing a set of modules designed to \
work with sets of codes which uniquely identify something. For example, \
there are codes associated with different countries, different currencies, \
different languages, etc. These sets of codes are typically maintained in \
some standard. \
 \
This distribution provides a way to work with these lists of codes. Because \
the data from the various standards is not available in any sort of \
consistent API, access to the lists is not available in any direct fashion. \
To compensate for this, the list of codes is stored internally within this \
distribution, and the distribution is updated on a regular basis to include \
all known codes at that point in time. This does mean that it is necessary \
to keep this distribution up-to-date to keep up with the various changes \
that are made in the various standards. \
 \
Traditionally, a module has been created to work with each type of code \
sets. So, there is a module for working with country lists, one for \
currency lists, etc. Since version 3.00, all of these individual modules \
were written as wrappers around a central module (which was not intended to \
be used directly) which did all of the real work. \
 \
Starting with version 3.50, the central module was reworked slightly to \
provide an object-oriented interface. All of the modules for working with \
individual types of code sets were reworked to use the improved OO module, \
so the traditional interfaces still work as they always have. As a result, \
you are free to use the traditional functional (non-OO) interfaces, or to \
use the OO interface and bypass the wrapper modules entirely. \
 \
Both methods will be supported in the future, so use the one that is best \
suited to your needs. \
 \
Within each type, any number of code sets are allowed. For example, sets of \
country codes are maintained in several different locations including the \
ISO-3166 standard, the IANA, and by the United Nations. The lists of \
countries are similar, but not identical. Multiple code sets are supported, \
though trying to convert from one code set to another will not always work \
since the list of countries is not one-to-one. \
 \
All data in all of these modules comes directly from the original standards \
(or as close to direct as possible), so it should be up-to-date at the time \
of release. \
 \
I plan on releasing a new version several times a year to incorporate any \
changes made in the standards. However, I don't always know about changes \
that occur, so if any of the standards change, and you want a new release \
sooner, just email me and I'll get one out."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.73"

RPM_NAME = "perl-Locale-Codes-3.73-1.1.noarch.rpm"
RPM_HASH = "6eb329b41cd7d16c040f68affcea2d0573d317f04aaafd34766d99d8adc27c5e3992f77f2c6b46390ccafd06e67960d8763570c0650ccc45caf194c4a0b8fe6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Locale::Codes) \
perl(Locale::Codes::Constants) \
perl(Locale::Codes::Country) \
perl(Locale::Codes::Currency) \
perl(Locale::Codes::LangExt) \
perl(Locale::Codes::LangFam) \
perl(Locale::Codes::LangVar) \
perl(Locale::Codes::Language) \
perl(Locale::Codes::Script) \
perl(Locale::Country) \
perl(Locale::Currency) \
perl(Locale::Language) \
perl(Locale::Script) \
perl-Locale-Codes"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
