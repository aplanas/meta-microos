SUMMARY = "An interactive, SSL/TLS-capable intercepting proxy"
DESCRIPTION = "mitmproxy is an interactive, SSL/TLS-capable intercepting proxy with a console \
interface for HTTP/1, HTTP/2, and WebSockets. \
 \
mitmdump is the command-line version of mitmproxy. Think tcpdump for HTTP. \
 \
mitmweb is a web-based interface for mitmproxy."
LICENSE = "MIT"

PV = "9.0.1"

RPM_NAME = "python311-mitmproxy-9.0.1-1.3.noarch.rpm"
RPM_HASH = "b13e05ecce4070ac20ee41105fbb59a843c42d1208d6b459c7692ae6c8f90bbf3267b7a447b99fb5c4d791179f7c035410e9878e681bce6819cb418c11ff135b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mitmproxy) python311-mitmproxy python3dist(mitmproxy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Brotli python311-Flask python311-asgiref python311-certifi python311-click python311-cryptography python311-h11 python311-h2 python311-hyperframe python311-kaitaistruct python311-ldap3 python311-mitmproxy-wireguard python311-msgpack python311-passlib python311-protobuf python311-publicsuffix2 python311-pyOpenSSL python311-pyparsing python311-pyperclip python311-ruamel.yaml python311-sortedcontainers python311-tornado python311-urwid python311-wsproto python311-zstandard update-alternatives"

inherit rpm
