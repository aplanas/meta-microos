SUMMARY = "WebDAV client library for Perl5"
DESCRIPTION = "HTTP::DAV is a Perl API for interacting with and modifying content on \
webservers using the WebDAV protocol. Now you can LOCK, DELETE and PUT \
files and much more on a DAV-enabled webserver."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.49"

RPM_NAME = "perl-HTTP-DAV-0.49-1.17.noarch.rpm"
RPM_HASH = "558ce007ede8bda0b89f9a29b7b881c08e5b89bfd10eb01c9ffa12b58bd52b5c75e926e544ac29ea5f2cd68bb86f3020891c44ce4d46751b200aaa66dc465a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::DAV) \
perl(HTTP::DAV::Comms) \
perl(HTTP::DAV::Headers) \
perl(HTTP::DAV::Lock) \
perl(HTTP::DAV::Resource) \
perl(HTTP::DAV::ResourceList) \
perl(HTTP::DAV::Response) \
perl(HTTP::DAV::UserAgent) \
perl(HTTP::DAV::Utils) \
perl-HTTP-DAV"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(LWP) \
perl(URI) \
perl(URI::Escape) \
perl(XML::DOM)"

inherit rpm
