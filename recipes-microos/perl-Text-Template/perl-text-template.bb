SUMMARY = "Expand template text with embedded Perl"
DESCRIPTION = "This is a library for generating form letters, building HTML pages, or \
filling in templates generally. A `template' is a piece of text that has \
little Perl programs embedded in it here and there. When you `fill in' a \
template, you evaluate the little programs and replace them with their \
values. \
 \
You can store a template in a file outside your program. People can modify \
the template without modifying the program. You can separate the formatting \
details from the main code, and put the formatting parts of the program \
into the template. That prevents code bloat and encourages functional \
separation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-Text-Template-1.61-1.6.noarch.rpm"
RPM_HASH = "f001dbda73f6973babf2738982240524228e88537230ff3aeaf0a10e06a7b61fd5d1b883530acc8464c386f94b7040963f651110dc49ba032c88e6606a2a4c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Template) perl(Text::Template::Preprocess) perl-Text-Template"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
