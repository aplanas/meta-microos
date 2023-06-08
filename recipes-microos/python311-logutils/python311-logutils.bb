SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python311-logutils-0.3.5-5.2.noarch.rpm"
RPM_HASH = "370a0261ba247cb3622b6d2a071d9c246f8055cfb3b5ddb07c2168d31b79f8e3d297503bde4d7bd1dbf1494251fa07be5b047376477faa679b05eca93a6ce115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(logutils) python311-logutils python3dist(logutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
