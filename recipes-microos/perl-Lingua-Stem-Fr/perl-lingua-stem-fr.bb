SUMMARY = "Perl French Stemming"
DESCRIPTION = "This module use the a modified version of the Porter Stemming Algorithm to \
return a stemmed words."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-Fr-0.02-9.24.noarch.rpm"
RPM_HASH = "a4d503786d9c24b262e75ba1cd5a44d179c0f45a0505d9183f551d06797e8da62c9057e02931332a2eaa29dc22cd5ca31c171a95a50eca62c07d2a36a1a16c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::Stem::Fr) perl-Lingua-Stem-Fr"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
