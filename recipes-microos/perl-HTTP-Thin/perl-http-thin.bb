SUMMARY = "A Thin Wrapper around HTTP::Tiny to play nice with HTTP::Message"
DESCRIPTION = "WARNING: This module is untested beyond the very basics. The implementation \
is simple enough that it shouldn't do evil things but, yeah it's still not \
approved for use by small children. \
 \
'HTTP::Thin' is a thin wrapper around the HTTP::Tiny manpage adding the \
ability to pass in the HTTP::Request manpage objects and get back the \
HTTP::Response manpage objects. The maintainers of the HTTP::Tiny manpage, \
justifiably, don't want to have to maintain compatibility but many other \
projects already consume the the HTTP::Message manpage objects. This is \
just glue code doing what it does best."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-HTTP-Thin-0.006-3.26.noarch.rpm"
RPM_HASH = "d7c0b69a539ce57b6d914883323b3ef6e523b273d359efbb478b38824d83877eac9e212676440c275ff233fe7acb0597109e4cb0c2c10d4cb78711145a341ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Thin) perl-HTTP-Thin"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Method::Modifiers) perl(HTTP::Response) perl(HTTP::Tiny) perl(Hash::MultiValue) perl(Safe::Isa) perl(parent)"

inherit rpm
