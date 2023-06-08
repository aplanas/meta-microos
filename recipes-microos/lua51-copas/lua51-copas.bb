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

RPM_NAME = "lua51-copas-2.0.2-4.1.noarch.rpm"
RPM_HASH = "9e1bb5a9bc0d0df858602d61ba9b95c46097d7dfccb65a5b91de112392b372b7be6add10a4a72d4f3be9e43335ad918a4958ce49a1915a9f91254d887beed159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-copas"
RDEPENDS:${PN} += "lua51"

inherit rpm
