SUMMARY = "Lists of reserved barewords and symbol names"
DESCRIPTION = "'B::Keywords' supplies several arrays of exportable keywords: '@Scalars', \
'@Arrays', '@Hashes', '@Filehandles', '@Symbols', '@Functions', \
'@Barewords', '@BarewordsExtra', '@TieIOMethods', '@UNIVERSALMethods' and \
'@ExporterSymbols'. \
 \
The '@Symbols' array includes the contents of each of '@Scalars', \
'@Arrays', '@Hashes', '@Functions' and '@Filehandles'. \
 \
Similarly, '@Barewords' adds a few non-function keywords and operators to \
the '@Functions' array. \
 \
'@BarewordsExtra' adds a few barewords which are not in keywords.h. \
 \
All additions and modifications are welcome. \
 \
The perl parser uses a static list of keywords from _regen/keywords.pl_ \
which constitutes the strict list of keywords @Functions and @Barewords, \
though some @Functions are not functions in the strict sense. Several \
library functions use more special symbols, handles and methods."
LICENSE = "Artistic-1.0 | GPL-2.0-only"

PV = "1.24"

RPM_NAME = "perl-B-Keywords-1.24-1.7.noarch.rpm"
RPM_HASH = "6c1208863539504629fc56cb72a9a6e797ad2fb7a0b2739542aaf82b85118ce60b873813bb69e917eb7cc84c193838385ad269a744ab5cc1438f759fb2cd05ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(B::Keywords) perl-B-Keywords"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
