SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.2"

RPM_NAME = "python311-tornado-6.2-16.1.noarch.rpm"
RPM_HASH = "8b28f62dc4fd3a90865c4bd8ff9ce2a4709faa7c64e6045d630dd540d9a52ef94016a7efcec7a3bed6d83e74c615316345935a6cb5b85b16c2044308460f93d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-tornado"
RDEPENDS:${PN} += "python311-tornado6"

inherit rpm
