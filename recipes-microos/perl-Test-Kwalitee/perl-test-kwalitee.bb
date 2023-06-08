SUMMARY = "Test the Kwalitee of a distribution before you release it"
DESCRIPTION = "Kwalitee is an automatically-measurable gauge of how good your software is. \
That's very different from quality, which a computer really can't measure \
in a general sense. (If you can, you've solved a hard problem in computer \
science.) \
 \
In the world of the CPAN, the CPANTS project (CPAN Testing Service; also a \
funny acronym on its own) measures Kwalitee with several metrics. If you \
plan to release a distribution to the CPAN -- or even within your own \
organization -- testing its Kwalitee before creating a release can help you \
improve your quality as well. \
 \
'Test::Kwalitee' and a short test file will do this for you automatically."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.28"

RPM_NAME = "perl-Test-Kwalitee-1.28-1.9.noarch.rpm"
RPM_HASH = "0a1439773601f5c76c4e9e0f00124b2c65b933399f230cbf22fcb9ef1c71c8f713283a57b7be9ffb8560a85be540a93c01f54862d93c5023c66ea3d1198cc629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Kwalitee) perl-Test-Kwalitee"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Module::CPANTS::Analyse) perl(Test::Builder) perl(parent)"

inherit rpm
