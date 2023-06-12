SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "python311-libevt-20221022-3.9.aarch64.rpm"
RPM_HASH = "a3cb80c9989bd4666f805afdb47eda4f6fc4a12524637609a2bcea98828a078a31222fef968fe8edcb750b0eb5445b000a783a22b146a0266ab1d955f5e19122"

RPROVIDES:${PN} += "python311-libevt \
python311-libevt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libevt.so.1()(64bit) \
libevt.so.1(V_20221022)(64bit) \
python(abi)"

inherit rpm
