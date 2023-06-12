SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-priority-2.0.0-2.1.noarch.rpm"
RPM_HASH = "030cfd72a546e2ed0d9fb3eb90ef4565b0a929458036099bf8a2eacd2d2185572c582c2e39413fa95666ffcc25ffdc5127b909407d7598afb25aff83a592d92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-priority \
python3.10dist(priority) \
python310-priority \
python3dist(priority)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
