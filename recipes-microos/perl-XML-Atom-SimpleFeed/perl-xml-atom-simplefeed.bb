SUMMARY = "No-fuss generation of Atom syndication feeds"
DESCRIPTION = "This is a minimal API for generating Atom syndication feeds quickly and \
easily. It supports all aspects of the Atom format itself but has no \
mechanism for the inclusion of extension elements. \
 \
You can supply strings for most things, and the module will provide useful \
defaults. When you want more control, you can provide data structures, as \
documented, to specify more particulars."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.905"

RPM_NAME = "perl-XML-Atom-SimpleFeed-0.905-1.2.noarch.rpm"
RPM_HASH = "d674391557a20c20015cb457073378fefc95af6296e91583e0885e0857bbfd496822d8360a2eaaaf032ba3a254a2639e7556fe0c18d1c8d855b79f285e91e3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Atom::SimpleFeed) perl-XML-Atom-SimpleFeed"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
