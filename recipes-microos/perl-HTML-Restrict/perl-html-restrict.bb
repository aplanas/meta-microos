SUMMARY = "Strip unwanted HTML tags and attributes"
DESCRIPTION = "This module uses HTML::Parser to strip HTML from text in a restrictive \
manner. By default all HTML is restricted. You may alter the default \
behaviour by supplying your own tag rules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0.2"

RPM_NAME = "perl-HTML-Restrict-3.0.2-1.1.noarch.rpm"
RPM_HASH = "ec9b7bb3a132899c27e4b57ddf75e9385d676e1adcc65628d6c2805aaa3940144e15b09052836c00db0cdb0805f731de54a5e384c550a06037a21de23b5f2ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::Restrict) perl-HTML-Restrict"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Data::Dump) perl(HTML::Entities) perl(HTML::Parser) perl(List::Util) perl(Moo) perl(Sub::Quote) perl(Type::Tiny) perl(Types::Standard) perl(URI) perl(namespace::clean) perl(version)"

inherit rpm
