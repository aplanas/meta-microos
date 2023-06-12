SUMMARY = "Greenlet Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for the Python Greenlet non-blocking network \
framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-greenlet-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "8ab3609debfa0e2a8c6cbfc4eb4e1a6bd7209c70fb6de0b187221d0f594388ef7ca749294a9852f18fdcc2961c048d8950f2fe57d0892cc9d71a50c9b7e43004"

RPROVIDES:${PN} += "uwsgi-greenlet \
uwsgi-greenlet(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
uwsgi \
uwsgi-python3"

inherit rpm
