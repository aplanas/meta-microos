SUMMARY = "Split text into sentences"
DESCRIPTION = "The 'Lingua::EN::Sentence' module contains the function get_sentences, \
which splits text into its constituent sentences, based on a regular \
expression and a list of abbreviations (built in and given). \
 \
Certain well know exceptions, such as abbreviations, may cause incorrect \
segmentations. But some of them are already integrated into this code and \
are being taken care of. Still, if you see that there are words causing the \
get_sentences function to fail, you can add those to the module, so it \
notices them. Note that abbreviations are case sensitive, so 'Mrs.' is \
recognised but not 'mrs.'"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Lingua-EN-Sentence-0.33-1.3.noarch.rpm"
RPM_HASH = "3d40bca88a411d27eaa4b5602147e32048d28d9e4e295437a629a390d9567ac2147a7dca68972c8a2241d19f7a5b2d7310b7684ddaf309c875f3b227e6059c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::EN::Sentence) perl-Lingua-EN-Sentence"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(warnings)"

inherit rpm
