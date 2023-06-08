SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.10.8"

RPM_NAME = "python310-flexmock-0.10.8-2.1.noarch.rpm"
RPM_HASH = "de812db5911ef0c2759d862c46923bbec1a1a0ac3d6a8a2ddbd20b3a995bee1588bfa184afe649706038701751b741194cf6959d717fc75044fbaaa3e2f3212d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexmock python3.10dist(flexmock) python310-flexmock python3dist(flexmock)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
