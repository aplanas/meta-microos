SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python310-wsgi_intercept-1.11.0-1.3.noarch.rpm"
RPM_HASH = "bcde65364c311873b9647a2abfb646f2adc8152be619f5d632062b677dfbd2c3f028a72b3da4a54cc00a0ba342ed190918162600d6e06f610a883d2fb8586234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsgi_intercept python3.10dist(wsgi-intercept) python310-wsgi_intercept python3dist(wsgi-intercept)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
