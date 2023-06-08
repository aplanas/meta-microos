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

RPM_NAME = "python311-stdeb-0.10.0-1.6.noarch.rpm"
RPM_HASH = "5b224ad42ed4edf1e5809793147f5ebf7a38e1e5f054dedf9d9d6e0316e4cbe9ac117f4328c1d8c16b72ff51aa2de2b5769f4176ceffbde67929a4e3c3166b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(stdeb) python311-stdeb python3dist(stdeb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 debhelper dpkg fakeroot python(abi) python311-requests update-alternatives"

inherit rpm
