SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python310-d2to1-0.2.12.post1-2.13.noarch.rpm"
RPM_HASH = "456a98ab19c098b90485e008467ba46a517c4d216deae661274e8910088e101f2ae3528c9dafef5075a81b0d5fa875175212463218a3110d0147e4520e3df041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-d2to1 python3.10dist(d2to1) python310-d2to1 python3dist(d2to1)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
