SUMMARY = "Atom feed and API implementation"
DESCRIPTION = "Atom is a syndication, API, and archiving format for weblogs and other \
data. _XML::Atom_ implements the feed format as well as a client for the \
API."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.43"

RPM_NAME = "perl-XML-Atom-0.43-1.9.noarch.rpm"
RPM_HASH = "35432d0f388977bf5d8bec41e247d24718190a15ef1c30a4222eb1fff460891336d1e358c00da713a36e09539182b0e0795ec71d9bbc9f17108e293a46d148a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(LWP::UserAgent::AtomClient) perl(XML::Atom) perl(XML::Atom::Base) perl(XML::Atom::Category) perl(XML::Atom::Client) perl(XML::Atom::Content) perl(XML::Atom::Entry) perl(XML::Atom::ErrorHandler) perl(XML::Atom::Feed) perl(XML::Atom::Link) perl(XML::Atom::Namespace) perl(XML::Atom::Person) perl(XML::Atom::Server) perl(XML::Atom::Thing) perl(XML::Atom::Util) perl-XML-Atom"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Data::Inheritable) perl(DateTime) perl(DateTime::TimeZone) perl(Digest::SHA) perl(LWP::UserAgent) perl(URI) perl(XML::LibXML) perl(XML::XPath)"

inherit rpm
