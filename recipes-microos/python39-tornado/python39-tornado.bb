SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python39-tornado-6.3.2-16.2.noarch.rpm"
RPM_HASH = "0ef74198e6d359d386d20589ad38b82a0754cdbd19bc778e8de67825ee10afc94bc5b732f1a6fa2feb5692defc04784e848512f73f45da47dbb7d2deb8d6e9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-tornado"
RDEPENDS:${PN} += "python39-tornado6"

inherit rpm
