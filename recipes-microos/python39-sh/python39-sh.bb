SUMMARY = "Python subprocess interface"
DESCRIPTION = "sh is a full-fledged subprocess replacement for Python 2.6 - 3.6, PyPy \
and PyPy3 that allows you to call any program as if it were a \
function: \
 \
    from sh import ifconfig \
    print ifconfig('eth0') \
 \
sh is not a collection of system commands implemented in Python."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python39-sh-2.0.3-1.1.noarch.rpm"
RPM_HASH = "49721cfc627aa1ed17c204f129e59954ea45645c06c5b947f2b688dc36bee134e649c195a0d1f498a6af75ffff686604d5420af488e816276034ca55f9c3db30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sh) python39-sh python3dist(sh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
