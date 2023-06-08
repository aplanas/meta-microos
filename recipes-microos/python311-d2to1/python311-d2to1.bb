SUMMARY = "Allows using distutils2-like setup.cfg with a distribute/setuptools"
DESCRIPTION = "d2to1 (the 'd' is for 'distutils') allows using distutils2-like setup.cfg \
files for a package's metadata with a distribute/setuptools setup.py script. \
It works by providing a distutils2-formatted setup.cfg file containing all of \
a package's metadata, and a very minimal setup.py which will slurp its arguments from the setup.cfg."
LICENSE = "BSD-3-Clause"

PV = "0.2.12.post1"

RPM_NAME = "python311-d2to1-0.2.12.post1-2.13.noarch.rpm"
RPM_HASH = "e64da3022d37a36bd9ecb1480b42091898791e162967e91c5362b5f70ad2a360f17bfde6b8374b8fbb95f4d3d7d94cf74a925e60a7926416e4966df5f9087730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(d2to1) python311-d2to1 python3dist(d2to1)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
