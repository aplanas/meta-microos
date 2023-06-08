SUMMARY = "Inflect short English Phrases"
DESCRIPTION = "Attempts to pluralize or singularize short English phrases. \
 \
Does not throw exceptions at present, if you attempt to pluralize an \
already pluralized phrase, it will leave it unchanged (and vice versa.) \
 \
The behavior of this module is subject to change as I tweak the heuristics, \
as some things get fixed others might regress. The processing of natural \
language is a messy business. \
 \
If it doesn't work, please email or submit to RT the example you tried, and \
I'll try to fix it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20"

RPM_NAME = "perl-Lingua-EN-Inflect-Phrase-0.20-1.17.noarch.rpm"
RPM_HASH = "ccd6938365538355291aabcd369637d3ab8193337bd83edfe9a5941175833d0c0869b461d854eb4f0c01d36ef28a747eb1f1465f932c385ba4a0078c0f2c9768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::EN::Inflect::Phrase) perl-Lingua-EN-Inflect-Phrase"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Lingua::EN::FindNumber) perl(Lingua::EN::Inflect) perl(Lingua::EN::Inflect::Number) perl(Lingua::EN::Number::IsOrdinal) perl(Lingua::EN::Tagger)"

inherit rpm
