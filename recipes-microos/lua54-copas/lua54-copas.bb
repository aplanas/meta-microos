SUMMARY = "Coroutine Oriented Portable Asynchronous Services"
DESCRIPTION = "Copas is a dispatcher based on coroutines that can be used by TCP/IP \
servers. It uses LuaSocket as the interface with the TCP/IP stack. \
A server registered with Copas should provide a handler for requests and \
use Copas socket functions to send the response. Copas loops through \
requests and invokes the corresponding handlers. For a full \
implementation of a Copas HTTP server you can refer to Xavante as an \
example."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "lua54-copas-2.0.2-4.1.noarch.rpm"
RPM_HASH = "6d4d512daea22884d8dc4a6220630ba7733ce532341420f6d7010f3b1ddf90c27d8a53ede5501f953ac01225b162e6241e35fac9f5a38faa9fa4ee359872548f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-copas lua54-copas"
RDEPENDS:${PN} += "lua54"

inherit rpm
