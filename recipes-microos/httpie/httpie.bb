SUMMARY = "CLI, cURL-like tool for humans"
DESCRIPTION = "HTTPie consists of a single 'http' command designed for debugging and \
interaction with HTTP servers, RESTful APIs, and web services. \
 \
It allows for issuing arbitrary HTTP requests and displays colorized \
responses."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "httpie-2.6.0-2.4.noarch.rpm"
RPM_HASH = "e41158f895bd2f14b56759c7b12603aa8cc79cfea58b67ff6168f545027fb0fa144390ea3925cd9bb26385a6275b731ce51a9c4293520fd23297bbf2c04b2cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpie python3-httpie python3.10dist(httpie) python38-httpie python3dist(httpie)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-Pygments python3-charset-normalizer python3-defusedxml python3-requests python3-requests-toolbelt python3-responses update-alternatives"

inherit rpm
