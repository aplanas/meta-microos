SUMMARY = "East Asian Width properties"
DESCRIPTION = "This module provide user-defined Unicode properties that deal with width \
status of East Asian characters, as specified in \
http://www.unicode.org/unicode/reports/tr11/. \
 \
It exports the following functions to the caller's scope, to be used by \
Perl's Unicode matching system: 'InEastAsianFullwidth', \
'InEastAsianHalfwidth', 'InEastAsianAmbiguous', 'InEastAsianNarrow' \
'InEastAsianWide', 'InEastAsianNeutral'. \
 \
In accord to TR11 cited above, two additional context-sensitive properties \
are exported: 'InFullwidth' (union of 'Fullwidth' and 'Wide') and \
'InHalfwidth' (union of 'Halfwidth', 'Narrow' and 'Neutral'). \
 \
_Ambiguous_ characters are treated by default as part of 'InHalfwidth', but \
you can modify this behaviour by assigning a true value to \
'$Unicode::EastAsianWidth::EastAsian' at compile time within a 'BEGIN' \
block before loading this module: \
 \
    BEGIN { $Unicode::EastAsianWidth::EastAsian = 1; } \
    use Unicode::EastAsianWidth; \
 \
Setting '$Unicode::EastAsianWidth::EastAsian' at run-time used to work on \
Perl versions between 5.8 and 5.14 due to an implementation detail, but it \
will no longer work on Perl 5.16 and later versions, and hence is not \
recommended."
LICENSE = "CC0-1.0"

PV = "12.0"

RPM_NAME = "perl-Unicode-EastAsianWidth-12.0-1.12.noarch.rpm"
RPM_HASH = "d45606ee3aa61961a41e8c58b91e5b6b1aa4c98d31b3d2eb213c99f382e7e7fb893a719ba620acef77a10edde5a212397c88b1b7fa5088b11fc5c8e7c82742b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Unicode::EastAsianWidth) \
perl-Unicode-EastAsianWidth"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
