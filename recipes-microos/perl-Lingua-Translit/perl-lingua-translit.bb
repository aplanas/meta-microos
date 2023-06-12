SUMMARY = "Transliterates text between writing systems"
DESCRIPTION = "Lingua::Translit can be used to convert text from one writing system to \
another, based on national or international transliteration tables. Where \
possible a reverse transliteration is supported. \
 \
The term 'transliteration' describes the conversion of text from one \
writing system or alphabet to another one. The conversion is ideally \
unique, mapping one character to exactly one character, so the original \
spelling can be reconstructed. Practically this is not always the case and \
one single letter of the original alphabet can be transcribed as two, three \
or even more letters. \
 \
Furthermore there is more than one transliteration scheme for one writing \
system. Therefore it is an important and necessary information, which \
scheme will be or has been used to transliterate a text, to work \
integrative and be able to reconstruct the original data. \
 \
Reconstruction is a problem though for non-unique transliterations, if no \
language specific knowledge is available as the resulting clusters of \
letters may be ambiguous. For example, the Greek character 'PSI' maps to \
'ps', but 'ps' could also result from the sequence 'PI', 'SIGMA' since 'PI' \
maps to 'p' and 'SIGMA' maps to s. If a transliteration table leads to \
ambiguous conversions, the provided table cannot be used reverse. \
 \
Otherwise the table can be used in both directions, if appreciated. So if \
ISO 9 is originally created to convert Cyrillic letters to the Latin \
alphabet, the reverse transliteration will transform Latin letters to \
Cyrillic."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.29"

RPM_NAME = "perl-Lingua-Translit-0.29-1.4.noarch.rpm"
RPM_HASH = "dda3a74d46409430568978291fd66257abb6d71af517baaeb091e0fb2c17fe059c449024f65b94c8dd61864a7f03099eb2a352b0a6c943d75dd2327eb05350af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::Translit) \
perl(Lingua::Translit::Tables) \
perl-Lingua-Translit"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
