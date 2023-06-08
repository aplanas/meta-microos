SUMMARY = "An automated checker to make sure a C++ file follows Google's C++ style guide"
DESCRIPTION = "This project continues the work of cpplint, a C++ style checker \
following Google's C++ style guide. It provides cpplint as a PyPI \
package and adds a few features and fixes. It is maintained as a \
fork of google/styleguide (https://github.com/google/styleguide) \
in hopes that it can be merged in the future."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python310-cpplint-1.6.1-1.1.noarch.rpm"
RPM_HASH = "15254ca2a423e747bb9be4de7ee148f31829b961b6dc43cdde7a02ba1efff03ce82f7d982e2770481895efba01ba0c28e1b72f49bae8274ff56c2b30cd126427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cpplint python3.10dist(cpplint) python310-cpplint python3dist(cpplint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
