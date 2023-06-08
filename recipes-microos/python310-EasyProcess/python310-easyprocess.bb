SUMMARY = "Python subprocess interface"
DESCRIPTION = "EasyProcess is a Python subprocess interface. \
 \
Features include: \
 - layer on top of subprocess module \
 - starting and stopping of programs \
 - retrieval of standard output/error, return code of programs \
 - command can be list or string \
 - logging \
 - timeout \
 - unit-tests \
 - cross-platform, development on linux \
 - global config file with program aliases \
 - unicode support \
 - supported python versions: 2.5, 2.6, 2.7, 3.1, 3.2, PyPy \
 \
Limitations: \
 - shell is not supported \
 - pipes are not supported \
 - stdout/stderr is set only after the subprocess has finished \
 - stop() does not kill whole subprocess tree"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python310-EasyProcess-1.1-2.3.noarch.rpm"
RPM_HASH = "b825ed687612802e9806a382c7d8b3e714ecc0fd86389b3b1d0929f8e08fc68b4ee5c3bd151d60bba49c6bb11b21d97c1cab7dab6bee1d27d203cb04f5028826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EasyProcess python3.10dist(easyprocess) python310-EasyProcess python3dist(easyprocess)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
