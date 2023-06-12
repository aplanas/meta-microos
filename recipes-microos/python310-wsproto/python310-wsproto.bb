SUMMARY = "WebSockets state-machine based protocol implementation"
DESCRIPTION = "This module contains a pure-Python implementation of a WebSocket \
protocol stack. It's written from the ground up to be embeddable in \
whatever program you choose to use, ensuring that you can \
communicate via WebSockets, as defined in RFC6455 \
<https://tools.ietf.org/html/rfc6455>, regardless of your \
programming paradigm. \
 \
This module does not provide a parsing layer, a network layer, or \
any rules about concurrency. Instead, it's a purely in-memory \
solution, defined in terms of data actions and WebSocket frames. \
RFC6455 and Compression Extensions for WebSocket via RFC7692 \
<https://tools.ietf.org/html/rfc7692> are fully supported."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-wsproto-1.2.0-3.1.noarch.rpm"
RPM_HASH = "143aa6375aa8f1f1cacae487049affa06328bbb0d40c235e625cd1fd59cb2ee1e009cd4e86fc91fd4b2acb1bcc48f3ba7491dc0b3c54193a8954a859909bf59d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsproto \
python3.10dist(wsproto) \
python310-wsproto \
python3dist(wsproto)"
RDEPENDS:${PN} += "python(abi) \
python310-h11"

inherit rpm
