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

RPM_NAME = "python311-sh-2.0.3-1.1.noarch.rpm"
RPM_HASH = "6922324c75458c626ef20cbabc9353eb8421acb16151f9213eb64ed9ea2d7a002b832d0d37acdec93d735cb53b313ae8e3d6b87d7547c093e6225fe8a2242868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sh) python311-sh python3dist(sh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
