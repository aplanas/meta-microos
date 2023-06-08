SUMMARY = "Python to GNU Octave bridge"
DESCRIPTION = "Oct2Py allows you to seamlessly call M-files and Octave functions from Python. \
It manages the Octave session for you, sharing data behind the scenes using \
MAT files."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python310-oct2py-5.0.4-2.9.noarch.rpm"
RPM_HASH = "13107ee146f60d45dff539cb50e9484edf4363e1547967ba7ebdf4325c7821ac1228612919f34af1085ff86fab644be3d1a6398d219e48c67f7843b0b2b2a879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oct2py python3.10dist(oct2py) python310-oct2py python3dist(oct2py)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-octave-kernel python310-scipy"

inherit rpm
