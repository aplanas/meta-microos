SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.0"

RPM_NAME = "python39-jaraco.text-3.11.0-1.3.noarch.rpm"
RPM_HASH = "5fb7841649fac947e3c170ce0bb4867f6c0bbb973e2e9012d9da2b52bb166834d05d942a824d14a13e560cf6ccc92f3603ac9911185f3b0bc06bb4506a06e850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.text) python39-jaraco.text python3dist(jaraco.text)"
RDEPENDS:${PN} += "python(abi) python39-autocommand python39-inflect python39-jaraco.context python39-jaraco.functools python39-more-itertools"

inherit rpm
