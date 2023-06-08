SUMMARY = "WebSocket client for AnyEvent"
DESCRIPTION = "This class provides an interface to interact with a web server that \
provides services via the WebSocket protocol in an AnyEvent context. It \
uses Protocol::WebSocket rather than reinventing the wheel. You could use \
AnyEvent and Protocol::WebSocket directly if you wanted finer grain \
control, but if that is not necessary then this class may save you some \
time. \
 \
The recommended API was added to the AnyEvent::WebSocket::Connection class \
with version 0.12, so it is recommended that you include that version when \
using this module. The older version of the API has since been deprecated \
and removed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-AnyEvent-WebSocket-Client-0.54-1.10.noarch.rpm"
RPM_HASH = "107268bf80a97aaeed40382d6225b5408a4fd535bb7fd8035c08788a4478d2bbad207e15864e661251aa28e933a6e824ec052a96760d8b7d35a6816cc6c35cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::WebSocket::Client) perl(AnyEvent::WebSocket::Connection) perl(AnyEvent::WebSocket::Message) perl-AnyEvent-WebSocket-Client"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(AnyEvent) perl(AnyEvent::Connector) perl(Moo) perl(PerlX::Maybe) perl(Protocol::WebSocket) perl(URI) perl(URI::ws)"

inherit rpm
