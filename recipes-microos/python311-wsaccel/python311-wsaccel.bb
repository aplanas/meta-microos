SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python311-wsaccel-0.6.4-1.5.aarch64.rpm"
RPM_HASH = "a14a43408c19a99de2518e5d8294cb8129f561901ac9fc6bbe048fdfabda0f90027136e2802bf7ad8e6867fca8d872613879478ecda17ef2853d6bfbd7dbecc7"

RPROVIDES:${PN} += "python3.11dist(wsaccel) \
python311-wsaccel \
python311-wsaccel(aarch-64) \
python3dist(wsaccel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
