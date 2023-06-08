SUMMARY = "Pytest plugin to help with comparing array output from tests"
DESCRIPTION = "This is a py.test plugin to facilitate the generation and comparison of \
data arrays produced during tests. \
 \
The basic idea is that you can write a test that generates a Numpy array (or \
other related objects depending on the format). You can then either run the \
tests in a mode to generate reference files from the arrays, or you can run \
the tests in comparison mode, which will compare the results of the tests to \
the reference ones within some tolerance. \
 \
At the moment, the supported file formats for the reference files are: \
 \
-  A plain text-based format (baSed on Numpy loadtxt output) \
-  The FITS format (requires astropy). With this format, tests \
   can return either a Numpy array for a FITS HDU object."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-arraydiff-0.5.0-1.3.noarch.rpm"
RPM_HASH = "7184fab5aa9d4f58f16e5d64aa5a5b17598a661b6677f01fb9f4e08553a60dfc4cf51fd0e85b805becc132ac93eab5fae5ddf09b887c8254886501f129042ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-arraydiff python3.10dist(pytest-arraydiff) python310-pytest-arraydiff python3dist(pytest-arraydiff)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-pytest"

inherit rpm
