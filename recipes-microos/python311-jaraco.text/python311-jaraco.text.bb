SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.0"

RPM_NAME = "python311-jaraco.text-3.11.0-1.3.noarch.rpm"
RPM_HASH = "c1a7ad63e4e07e1315e73a542554c6193f8a536c31215d9f47f46dc41ba4f314bbb3463ad78a15c7cd5315db41209c3eb4b0b845cdad475214abc4d205c77519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.text) python311-jaraco.text python3dist(jaraco.text)"
RDEPENDS:${PN} += "python(abi) python311-autocommand python311-inflect python311-jaraco.context python311-jaraco.functools python311-more-itertools"

inherit rpm
