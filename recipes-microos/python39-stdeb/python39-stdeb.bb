SUMMARY = "Python to Debian source package conversion utility"
DESCRIPTION = "The stdeb package produces Debian source packages from Python packages \
via a new distutils command, sdist_dsc. Automatic defaults are provided \
for the Debian package, but many aspects of the resulting package can be \
customized (see the customizing section, below). An additional command, \
bdist_deb, creates a Debian binary package, a .deb file. The install_deb \
command installs this .deb file. The debianize command builds a \
debian/ directory directly alongside your setup.py. \
 \
The openSUSE version does not fail for unmet dependencies in the host \
dpkg database."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-stdeb-0.10.0-1.6.noarch.rpm"
RPM_HASH = "1188b0317fac79e1dc82389d5416eb6d7eac1bee58e8aa36b1030fb985ea5b309034606de2160c4ff59ee1ada96209e3bf03b703c3db196311e9c50052ded715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stdeb) \
python39-stdeb \
python3dist(stdeb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
debhelper \
dpkg \
fakeroot \
python(abi) \
python39-requests \
update-alternatives"

inherit rpm
