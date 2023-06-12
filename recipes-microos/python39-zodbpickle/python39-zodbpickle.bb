SUMMARY = "Fork of Python 3 pickle module"
DESCRIPTION = "This package presents a uniform pickling interface for ZODB: \
 * Under Python2, this package forks both Python 2.7’s pickle and \
   cPickle modules, adding support for the protocol 3 opcodes. \
   It also provides a new subclass of bytes, zodbpickle.binary, \
   which Python2 applications can use to pickle binary values such \
   that they will be unpickled as bytes under Py3k. \
 * Under Py3k, this package forks the pickle module (and the \
   supporting C extension) from both Python 3.2 and Python 3.3. \
   The fork add support for the noload operations used by ZODB."
LICENSE = "Python-2.0 & ZPL-2.1"

PV = "2.6"

RPM_NAME = "python39-zodbpickle-2.6-1.5.aarch64.rpm"
RPM_HASH = "19d4b186adb73997baed0daa2516b3d75caaf2809c44777677633098146e4258455f4aac2d1c01052dca357ba07b909475178ba86a912bb2185ea84490bd65c8"

RPROVIDES:${PN} += "python3.9dist(zodbpickle) \
python39-zodbpickle \
python39-zodbpickle(aarch-64) \
python3dist(zodbpickle)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
