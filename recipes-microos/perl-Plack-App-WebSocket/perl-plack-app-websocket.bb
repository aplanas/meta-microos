SUMMARY = "WebSocket server as a PSGI application"
DESCRIPTION = "This module is a PSGI application that creates an endpoint for WebSocket \
connections."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Plack-App-WebSocket-0.08-1.11.noarch.rpm"
RPM_HASH = "6a62ed39be295d369d65b81b3e9f6ec8a9dbcf85fb90e8a9f632550291bcdce6ffbafe2bbb9e7f5898f2713339618a9e12a0e43515f643fcb0fb9f28dc03c752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Plack::App::WebSocket) \
perl(Plack::App::WebSocket::Connection) \
perl-Plack-App-WebSocket"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent) \
perl(AnyEvent::WebSocket::Server) \
perl(Devel::GlobalDestruction) \
perl(Plack::Component) \
perl(Plack::Response) \
perl(Try::Tiny) \
perl(parent)"

inherit rpm
