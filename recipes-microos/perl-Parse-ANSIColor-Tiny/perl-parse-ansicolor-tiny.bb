SUMMARY = "Determine attributes of ANSI-Colored string"
DESCRIPTION = "Parse a string colored with ANSI escape sequences into a structure suitable \
for reformatting (into HTML, for example). \
 \
The output of terminal commands can be marked up with colors and formatting \
that in some instances you'd like to preserve. \
 \
This module is essentially the inverse of Term::ANSIColor. The array refs \
returned from parse can be passed back in to 'Term::ANSIColor::colored'. \
The strings may not match exactly due to different ways the attributes can \
be specified, but the end result should be colored the same. \
 \
This is a '::Tiny' module... it attempts to be correct for most cases with \
a small amount of code. It may not be 100% correct, especially in complex \
cases. It only handles the 'm' escape sequence ('\\033[0m') which produces \
colors and simple attributes (bold, underline) (like what can be produced \
with Term::ANSIColor). Other escape sequences are removed by default but \
you can disable this by passing 'remove_escapes => 0' to the constructor. \
 \
If you do find bugs please submit tickets (with patches, if possible)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.700"

RPM_NAME = "perl-Parse-ANSIColor-Tiny-0.700-1.2.noarch.rpm"
RPM_HASH = "8c1ee6563d7766b3bcbbdc84dd0889f14f845b778d63e94aea8ccd25c8965c7adce136825a6bfbba0c8c7e112db989f000cac23e0da5747e11c755ef54e31584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::ANSIColor::Tiny) perl-Parse-ANSIColor-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
