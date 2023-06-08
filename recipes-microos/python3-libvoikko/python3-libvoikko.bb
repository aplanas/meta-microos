SUMMARY = "Python interface to libvoikko"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a Python interface to libvoikko. This module \
can be used to perform various natural language analysis tasks on text."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-libvoikko-4.3.1-1.10.noarch.rpm"
RPM_HASH = "b676972abfb0dcccccb1ba2a0d70283a9f32930c78d851b84294d9fc2ed80a400cde7b52bda3d188684d042acb6be54384dcb1676e56ba7c9b9fa70b3a49416a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libvoikko"
RDEPENDS:${PN} += "libvoikko1 python(abi)"

inherit rpm
