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

RPM_NAME = "python39-repoze.who-2.4.1-1.3.noarch.rpm"
RPM_HASH = "1a598e0e6fd87c987b8ce967e28bd53046e4e019e0a43c09c1947fd584641bd6c5a89869e4a88b39056d4718adc45355f51ae91d54d6e9f4a1cda7f794aae3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(repoze.who) python39-repoze.who python3dist(repoze.who)"
RDEPENDS:${PN} += "python(abi) python39-WebOb python39-zope.interface"

inherit rpm
