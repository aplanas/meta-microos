SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "python310-jaraco.text-3.11.1-1.1.noarch.rpm"
RPM_HASH = "23caa33f2817fde40a6c006c7da78528cbe8d190b72449fa647ff563737d90873801ef583e765b6fc73129e00ef777a9fc8cf15c947153da9d34f8e892f0060e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.text python3.10dist(jaraco.text) python310-jaraco.text python3dist(jaraco.text)"
RDEPENDS:${PN} += "python(abi) python310-autocommand python310-inflect python310-jaraco.context python310-jaraco.functools python310-more-itertools"

inherit rpm
