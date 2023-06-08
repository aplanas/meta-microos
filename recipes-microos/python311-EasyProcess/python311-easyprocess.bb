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

RPM_NAME = "python311-EasyProcess-1.1-2.3.noarch.rpm"
RPM_HASH = "7cd0a8382dbb9d988891030807e24c7d4e0e36e9979ac0afd0932c016074ba29c05f909788ee9fdd66ce08d9437e6ad4f5cb7d7c0ea9f66702778d57e5ce9fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(easyprocess) python311-EasyProcess python3dist(easyprocess)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
