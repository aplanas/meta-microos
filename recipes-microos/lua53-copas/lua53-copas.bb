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

RPM_NAME = "lua53-copas-2.0.2-4.1.noarch.rpm"
RPM_HASH = "021535e3b1227703a2628ebaecf07d4d89dc01b6d7bf119cba2146137bfe48b3ab4c6d07d70743bfac26218a24e42d849536a1c8c77a66f013d85554e49a11d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-copas"
RDEPENDS:${PN} += "lua53"

inherit rpm
