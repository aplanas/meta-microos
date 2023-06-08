SUMMARY = "Add a websocket interface to your Dancers app"
DESCRIPTION = "'Dancer2::Plugin::WebSocket' provides an interface to Plack::App::WebSocket \
and allows to interact with the webSocket connections within the Dancer \
app. \
 \
Plack::App::WebSocket, and thus this plugin, requires a plack server that \
supports the psgi _streaming_, _nonblocking_ and _io_. Twiggy is the most \
popular server fitting the bill."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.1"

RPM_NAME = "perl-Dancer2-Plugin-WebSocket-0.3.1-1.9.noarch.rpm"
RPM_HASH = "da8776906de5db1e507948f387cb790ad87858d3ed162d5814a9e6cb15e24e3c77a719ac80e9ee99f8547f9a489e0dedaa961a81ed458403641bbdcf4d68d096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Dancer2::Plugin::WebSocket) perl(Dancer2::Plugin::WebSocket::Connection) perl(Dancer2::Plugin::WebSocket::Group) perl-Dancer2-Plugin-WebSocket"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Dancer2::Plugin) perl(JSON::MaybeXS) perl(Moo) perl(Moo::Role) perl(Plack::App::WebSocket) perl(Set::Tiny) perl(Try::Tiny)"

inherit rpm
