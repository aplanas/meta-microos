SUMMARY = "WebSocket support for URI package"
DESCRIPTION = "After this module is installed, the URI package provides the same set of \
methods for WebSocket URIs as it does for HTTP ones. For secure WebSockets, \
see URI::wss."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-URI-ws-0.03-1.11.noarch.rpm"
RPM_HASH = "3b40c7d3b4968809918a289bfb7037c0a037718b4eecaec3a686c417a4566b805f789d13298f63e09a15744b7afbde2c320938fd003b4046fd1d6a20766acdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::ws) perl(URI::wss) perl-URI-ws"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(URI)"

inherit rpm
