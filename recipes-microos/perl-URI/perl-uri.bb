SUMMARY = "Uniform Resource Identifiers (absolute and relative)"
DESCRIPTION = "This module implements the 'URI' class. Objects of this class represent \
'Uniform Resource Identifier references' as specified in RFC 2396 (and \
updated by RFC 2732). \
 \
A Uniform Resource Identifier is a compact string of characters that \
identifies an abstract or physical resource. A Uniform Resource Identifier \
can be further classified as either a Uniform Resource Locator (URL) or a \
Uniform Resource Name (URN). The distinction between URL and URN does not \
matter to the 'URI' class interface. A 'URI-reference' is a URI that may \
have additional information attached in the form of a fragment identifier. \
 \
An absolute URI reference consists of three parts: a _scheme_, a \
_scheme-specific part_ and a _fragment_ identifier. A subset of URI \
references share a common syntax for hierarchical namespaces. For these, \
the scheme-specific part is further broken down into _authority_, _path_ \
and _query_ components. These URIs can also take the form of relative URI \
references, where the scheme (and usually also the authority) component is \
missing, but implied by the context of the URI reference. The three forms \
of URI reference syntax are summarized as follows: \
 \
  <scheme>:<scheme-specific-part>#<fragment> \
  <scheme>://<authority><path>?<query>#<fragment> \
  <path>?<query>#<fragment> \
 \
The components into which a URI reference can be divided depend on the \
_scheme_. The 'URI' class provides methods to get and set the individual \
components. The methods available for a specific 'URI' object depend on the \
scheme."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.19"

RPM_NAME = "perl-URI-5.19-1.1.noarch.rpm"
RPM_HASH = "c8c5c191a87856371fbfad4c861f3d4a56a673937cd385deb42d9ed1d05af68f03a15fd6b47fd7e4e920b17fdf4270a182d8d7935a23bbe4a3ad462ec6fc7cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI) perl(URI::Escape) perl(URI::Heuristic) perl(URI::IRI) perl(URI::QueryParam) perl(URI::Split) perl(URI::URL) perl(URI::WithBase) perl(URI::_foreign) perl(URI::_generic) perl(URI::_idna) perl(URI::_ldap) perl(URI::_login) perl(URI::_punycode) perl(URI::_query) perl(URI::_segment) perl(URI::_server) perl(URI::_userpass) perl(URI::data) perl(URI::file) perl(URI::file::Base) perl(URI::file::FAT) perl(URI::file::Mac) perl(URI::file::OS2) perl(URI::file::QNX) perl(URI::file::Unix) perl(URI::file::Win32) perl(URI::ftp) perl(URI::gopher) perl(URI::http) perl(URI::https) perl(URI::ldap) perl(URI::ldapi) perl(URI::ldaps) perl(URI::mailto) perl(URI::mms) perl(URI::news) perl(URI::nntp) perl(URI::nntps) perl(URI::pop) perl(URI::rlogin) perl(URI::rsync) perl(URI::rtsp) perl(URI::rtspu) perl(URI::sftp) perl(URI::sip) perl(URI::sips) perl(URI::snews) perl(URI::ssh) perl(URI::telnet) perl(URI::tn3270) perl(URI::urn) perl(URI::urn::isbn) perl(URI::urn::oid) perl-URI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
