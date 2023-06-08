SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python310-surer-0.0.3-1.4.noarch.rpm"
RPM_HASH = "e81a4668210d40f0903090681d6e3f3a95df7ff7102220c4aaff3dead7e5f1dc8d265f0c3bc8b8ddf568662e33138a17904b50113bb844f106de6d08124985b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-surer python3.10dist(surer) python310-surer python3dist(surer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
