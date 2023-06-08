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

RPM_NAME = "python310-sh-2.0.3-1.1.noarch.rpm"
RPM_HASH = "8f2ea1e558cb1f151f2ef27379b5548b1c598cff8c769ef12f786a28e698497e6d060b5fc2f17c129428a8c5f6b5727920f0309e6103f5be0fd823340b4758e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sh python3.10dist(sh) python310-sh python3dist(sh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
