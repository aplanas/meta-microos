SUMMARY = "Allows your classes to do coercion of parameters"
DESCRIPTION = "A big part of good API design is that we should be able to be flexible in \
the ways that we take parameters. \
 \
Params::Coerce attempts to encourage this, by making it easier to take a \
variety of different arguments, while adding negligible additional \
complexity to your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Params-Coerce-0.15-1.10.noarch.rpm"
RPM_HASH = "469b537d49eaa08e17d3148735ba4414c73463a6b41ee0bda9b2dde191fd0da9def3faea132ac3a0577aa2b5cfb177f97d8d1b74b3e461e7eb92956fca801f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Params::Coerce) perl-Params-Coerce"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Params::Util)"

inherit rpm
