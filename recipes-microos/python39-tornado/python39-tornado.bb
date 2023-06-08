SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.2"

RPM_NAME = "python39-tornado-6.2-16.1.noarch.rpm"
RPM_HASH = "22ad4c2f424b40c2b0a3947873f8f7cca1094c7142b5fbd91489cafc0835e0daa05ec056551b06725397721c7f2e1bfdb7dd41a023e2dec1bbc3f117a0883246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-tornado"
RDEPENDS:${PN} += "python39-tornado6"

inherit rpm
