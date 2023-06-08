SUMMARY = "Sprintf-like function with named conversions"
DESCRIPTION = "Text::Sprintf::Named provides a sprintf equivalent with named conversions. \
Named conversions are sprintf field specifiers (like ''%s'' or ''%4d'') \
only they are associated with the key of an associative array of \
parameters. So for example ''s'' will emit the ''name'' parameter as \
a string, and ''4d'' will emit the ''num'' parameter as a variable \
with a width of 4."
LICENSE = "MIT"

PV = "0.0405"

RPM_NAME = "perl-Text-Sprintf-Named-0.0405-1.12.noarch.rpm"
RPM_HASH = "53ff32e9ef60895718e0343073222c1c3952ae04e8f51b50b6c49d5574cfb0bd033dfae92c6a0fe29f951c6e95116fccec487980049a0b7fff70cb24ad9cae9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Sprintf::Named) perl-Text-Sprintf-Named"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
