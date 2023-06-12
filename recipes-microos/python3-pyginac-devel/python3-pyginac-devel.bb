SUMMARY = "Headers and pkgconfig file for pyginac"
DESCRIPTION = "PyGiNaC is a Python package that provides an interface to the C++ library \
GiNaC, which is an open framework for symbolic computation within C++. PyGiNaC \
is implemented with the help of the Boost.Python library. \
 \
This package provides the header and pkgconfig file used when developing against \
pyginac."
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "python3-pyginac-devel-1.5.5-2.23.aarch64.rpm"
RPM_HASH = "d5646e5b9abba63b03773b1a1d697705c36faa01bb041e2d6204dd37890626fdc2c06e875b207dfe73996dea8028b22d41a84a0b8aaa55af8efcb8d81b02b525"

RPROVIDES:${PN} += "pkgconfig(pyginac) \
python3-pyginac-devel \
python3-pyginac-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(ginac) \
python3-pyginac"

inherit rpm
