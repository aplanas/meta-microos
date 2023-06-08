SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-cpplint-1.6.1-1.1.noarch.rpm"
RPM_HASH = "347cd35dede9ffe1ae40d3e8df7dd66c6edb55d0115fb15827504604271dc73080d1f997a2701b656458da3ef9649d312b171aa2cb43e94fb7552d7c96669796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cpplint) python311-cpplint python3dist(cpplint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
