SUMMARY = "Identification and authentication framework for WSGI"
DESCRIPTION = "repoze.who is an identification and authentication framework \
for arbitrary WSGI applications.  repoze.who can be configured \
either as WSGI middleware or as an API for use by an application. \
 \
repoze.who is inspired by Zope 2's Pluggable Authentication \
Service (PAS) (but repoze.who is not dependent on Zope in any \
way; it is useful for any WSGI application).  It provides no facility \
for authorization (ensuring whether a user can or cannot perform the \
operation implied by the request).  This is considered to be the \
domain of the WSGI application."
LICENSE = "SUSE-Repoze"

PV = "2.4.1"

RPM_NAME = "python310-repoze.who-2.4.1-1.3.noarch.rpm"
RPM_HASH = "345e68a993831ab4a4b60bf8758f12646fc79af8a410c7c795391780c238b851b9367a4148901a2a8e364bd66f192c3ae0b00d51702a5b3f7c65f671fe914565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.who python3.10dist(repoze.who) python310-repoze.who python3dist(repoze.who)"
RDEPENDS:${PN} += "python(abi) python310-WebOb python310-zope.interface"

inherit rpm
