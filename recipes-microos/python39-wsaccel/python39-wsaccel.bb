SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python39-wsaccel-0.6.4-1.5.aarch64.rpm"
RPM_HASH = "d98558c5f9ce58f721f8f122f6e365d2a5d733761c2c41602dae2a59317d2f3bdff75a92f0b49f5b88b6555f991b16d0386f63e75209017dce500d6159e61bee"

RPROVIDES:${PN} += "python3.9dist(wsaccel) \
python39-wsaccel \
python39-wsaccel(aarch-64) \
python3dist(wsaccel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
