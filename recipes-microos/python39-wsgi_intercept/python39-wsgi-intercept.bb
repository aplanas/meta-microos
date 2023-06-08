SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python39-wsgi_intercept-1.11.0-1.3.noarch.rpm"
RPM_HASH = "95c5e69861d7122b0648da0d29439e99a7b4873a8966f88a84ffd4cd7e3e7a3cd7b0ca6b25abb9213e566168974623b77f4f93430f03c71ea75fe0384d2ec336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wsgi-intercept) python39-wsgi_intercept python3dist(wsgi-intercept)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
