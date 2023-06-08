SUMMARY = "Documentation for python-debtcollector"
DESCRIPTION = "A collection of Python deprecation patterns and strategies that help \
you collect your technical debt in a non-destructive manner. The goal \
of this library is to provide well documented developer facing \
deprecation patterns that start of with a basic set and can expand \
into a larger set of patterns as time goes on. The desired output of \
these patterns is to apply the warnings module to emit \
DeprecationWarning or PendingDeprecationWarning or similar derivative \
to developers using libraries (or potentially applications) about \
future deprecations. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python-debtcollector-doc-2.5.0-1.4.noarch.rpm"
RPM_HASH = "423ca0d200555e520fa1ed448277fc69d9a00b361038bb00b9bc2245b848ca92e8a7fa3a91e5acebe2efd782b4995e9558f2aa184cf0b677b873d3091b8373a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-debtcollector-doc"
RDEPENDS:${PN} += ""

inherit rpm
