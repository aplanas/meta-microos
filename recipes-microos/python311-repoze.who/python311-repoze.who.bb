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

RPM_NAME = "python311-repoze.who-2.4.1-1.3.noarch.rpm"
RPM_HASH = "f5703cda065d023343edc584c13dabbe78248f0ca4ee45f74b16b64625c81f1d03e9149dd51cf140c9c9d4ee4dfe4e38a3b278a84df0b0e6807480bc198f0702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(repoze.who) \
python311-repoze.who \
python3dist(repoze.who)"
RDEPENDS:${PN} += "python(abi) \
python311-WebOb \
python311-zope.interface"

inherit rpm
