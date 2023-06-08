SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python311-PyPrind-2.11.3-1.3.noarch.rpm"
RPM_HASH = "1a42d7396a22d14a817f2806eb7d833d604381ea3d0ecf85b66d080265391a4624f21743087535cee7a22b1938b8cd67c10286ce071fc2e3cb7d58d69a9699cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyprind) python311-PyPrind python3dist(pyprind)"
RDEPENDS:${PN} += "python(abi) python311-psutil"

inherit rpm
