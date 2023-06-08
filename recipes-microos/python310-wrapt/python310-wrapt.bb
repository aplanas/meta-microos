SUMMARY = "A Python module for decorators, wrappers and monkey patching"
DESCRIPTION = "The aim of the **wrapt** module is to provide a transparent object proxy \
for Python, which can be used as the basis for the construction of function \
wrappers and decorator functions. \
 \
The **wrapt** module focuses very much on correctness. It therefore goes \
way beyond existing mechanisms such as ``functools.wraps()`` to ensure that \
decorators preserve introspectability, signatures, type checking abilities \
etc. The decorators that can be constructed using this module will work in \
far more scenarios than typical decorators and provide more predictable and \
consistent behaviour. \
 \
To ensure that the overhead is as minimal as possible, a C extension module \
is used for performance critical components. An automatic fallback to a \
pure Python implementation is also provided where a target system does not \
have a compiler to allow the C extension to be compiled. \
 \
Documentation \
------------- \
 \
For further information on the **wrapt** module see: \
 \
* http://wrapt.readthedocs.org/"
LICENSE = "BSD-2-Clause"

PV = "1.15.0"

RPM_NAME = "python310-wrapt-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "3d79c023488aa7357e1d6395070e8cbd4f398eb8a577f5736d013499494f35a6d75bcdcc937688f96286414372a44efeed29044ee4874db24b513601d8267fb3"

RPROVIDES:${PN} += "python3-wrapt python3.10dist(wrapt) python310-wrapt python310-wrapt(aarch-64) python3dist(wrapt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
