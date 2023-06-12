SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.4"

RPM_NAME = "python310-wsaccel-0.6.4-1.5.aarch64.rpm"
RPM_HASH = "72d3ce2291322e4ee69f2a7df35700d4e9f85d8ef0691c3efe676bbeb872f4ae09bc603a188f7a6e7cab3e813ec0f3f83ba917f1bf7880107b727d11b257f32a"

RPROVIDES:${PN} += "python3-wsaccel \
python3.10dist(wsaccel) \
python310-wsaccel \
python310-wsaccel(aarch-64) \
python3dist(wsaccel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
