SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.0"

RPM_NAME = "python310-jaraco.text-3.11.0-1.3.noarch.rpm"
RPM_HASH = "f6c4090f77a2947b3b47f3927fbcc1ccaec7ee8f02548ccaf20bde98efec84df1680f13d1173d249a4fa5f92b9697af176044bc4adae7590988b213b2dfeed32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.text python3.10dist(jaraco.text) python310-jaraco.text python3dist(jaraco.text)"
RDEPENDS:${PN} += "python(abi) python310-autocommand python310-inflect python310-jaraco.context python310-jaraco.functools python310-more-itertools"

inherit rpm
