SUMMARY = "Python Version Management"
DESCRIPTION = "pyenv lets the user switch between multiple versions of Python. \
 \
This project was forked from rbenv and ruby-build, and modified for Python."
LICENSE = "MIT"

PV = "2.3.17"

RPM_NAME = "pyenv-2.3.17-1.1.aarch64.rpm"
RPM_HASH = "fbe85cfa7a21493f128e68403543760af086319c6cf4877e43959d13a981a12a0023620eec1f310bf59db5184a1a773000f0472434bf72b8565c7b4c675c0964"

RPROVIDES:${PN} += "config(pyenv) \
pyenv \
pyenv(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
